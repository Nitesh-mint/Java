public class threadd extends Thread {
    public void run(){
        System.out.println("Nitesh");
    }
    public static void main(String[] args) {
        threadd t = new threadd();
        t.start();
    }
}
