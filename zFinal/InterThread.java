public class InterThread {
    // adding a comment
    public static void main(String[] args) {
        Object obj = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized(obj){
                System.out.println("Thread1 acquired obj");
                try{
                    Thread.sleep(1000);
                    obj.wait();
                    System.out.println("Thread1 resumed execution");
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized(obj){
                System.out.println("thread2 acquired obj");
                try{
                    Thread.sleep(1000);
                    obj.notify();
                    System.out.println("Thread2 notified Thread1");
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        
        thread1.start();
        thread2.start();
    }
}
