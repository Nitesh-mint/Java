class th extends Thread{
    public void run(){
        System.out.println("Thread starting");
        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        System.out.println("Thread ending");
    }
}
public class threadRunnable{
    public static void main(String[] args) {
        th thread = new th();
        System.out.println(thread.isAlive());
        thread.start();
        System.out.println(thread.isAlive());
    }
}
