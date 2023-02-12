class Thdemo extends Thread{
    public void run(){
        System.out.println("This is a new thread!");
        try{
            Thread.sleep(50);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("New Thread Finished");
    }   

}


public class ExtendingThread {
    public static void main(String[] args) {
        Thdemo firstThread = new Thdemo();
        firstThread.start(); 
    }
}
