public class deadlock {
    public static void main(String[] args) {
        Object resource1 = new Object();
        Object resource2 = new Object();
        
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1 locked resource 1");
                try {
                    Thread.sleep(100);
                    resource1.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println("Thread 1 locked resource 2");
                }
            }
        });
        
        Thread thread2 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 2 locked resource 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource1) {
                    System.out.println("Thread 2 locked resource 1");
                }
            }
        });
        
        thread1.start();
        thread2.start();
    }
}
