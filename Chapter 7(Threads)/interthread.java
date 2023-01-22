public class interthread {
    public static void main(String[] args) {
       final Object sharedObject = new Object();
       Thread thread1 = new Thread(new Runnable() {
          @Override
          public void run() {
             synchronized (sharedObject) {
                try {
                   System.out.println("Thread 1: Waiting for thread 2 to notify me.");
                   sharedObject.wait();
                   System.out.println("Thread 1: Thread 2 notified me.");
                } catch (InterruptedException e) {
                   e.printStackTrace();
                }
             }
          }
       });
 
       Thread thread2 = new Thread(new Runnable() {
          @Override
          public void run() {
             synchronized (sharedObject) {
                System.out.println("Thread 2: Notifying thread 1.");
                sharedObject.notify();
             }
          }
       });
 
       thread1.start();
       thread2.start();
    }
 }
 