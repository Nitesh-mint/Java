public class handling {
    public static void main(String[] args) {
        int i = 0;
        int j = 5;
        try{
            System.out.println(5);
        }
        catch(ArithmeticException e){
            System.out.println("You cannot divide by zero");
        }
        finally{
            System.out.println("Ldo turi");
        }
    }
}
