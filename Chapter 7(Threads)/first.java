public class first extends Thread{
    public void run(){
        int a = 5;
        int b = 5;
        int result = a + b;
        System.out.println("Thread started running..");
        System.out.println(result);
    }
    public static void main(String args[]){
        first f = new first();
        // f.start();
        // f.run();
        try{
            System.out.println(5/0);
        }
        catch(ArithmeticException e){
            System.out.println("Divider cannot be zero");
        }
    }
}