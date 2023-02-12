class Thdemo implements Runnable{
    public void run(){
        //this runs when a new thread is stared
        System.out.println("This is a new thread");
        //try catch lagauna is imp beacuse while trying to sleep a thread 
        //error aune change huncha so it is necessary to handle it 
        try{
            Thread.sleep(50); //asking thread to sleep for 50 milsec
        }catch(InterruptedException e){
            e.printStackTrace();//to print the error and debug
        }

        System.out.println("New Thread Finished");
    }
}
public class simpleThread{
    public static void main(String args[]){
        Thdemo firstRunnable  = new Thdemo();//creating my runnable instance
        //passing runnable to the Thread Object
        Thread firstThread = new Thread(firstRunnable);
        //start the thread
        firstThread.start();
        //runs after the above code is started
        System.out.println("This is the main thread");
    }
}