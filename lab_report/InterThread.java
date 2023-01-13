// Java program to demonstrate inter-thread communication
// (wait(), join() and notify())

import java.util.Scanner;

public class InterThread
{
	public static void main(String[] args) throws InterruptedException
	{
		final PC pc = new PC();

		// Create a thread object that calls pc.produce()
		Thread t1 = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					pc.produce();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		});

		// Create another thread object that calls
		// pc.consume()
		Thread t2 = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					pc.consume();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		});

		// Start both threads
		t1.start();
		t2.start();

		// t1 finishes before t2
		t1.join();
		t2.join();
	}

	// PC (Produce Consumer) class with produce() and
	// consume() methods.
	public static class PC
	{
		// Prints a string and waits for consume()
		public void produce()throws InterruptedException
		{
			// synchronized block ensures only one thread
			// running at a time.
			synchronized(this)
			{
				System.out.println("producer thread running");

				// releases the lock on shared resource
				wait();

				// and waits till some other method invokes notify().
				System.out.println("Resumed");
			}
		}

		// Sleeps for some time and waits for a key press. After key
		// is pressed, it notifies produce().
		public void consume()throws InterruptedException
		{
			// this makes the produce thread to run first.
			Thread.sleep(1000);
			Scanner s = new Scanner(System.in);

			// synchronized block ensures only one thread
			// running at a time.
			synchronized(this)
			{
				System.out.println("Waiting for return key.");
				s.nextLine();
				System.out.println("Return key pressed");

				// notifies the produce thread that it
				// can wake up.
				notify();

				// Sleep
				Thread.sleep(2000);
			}
		}
	}
}
