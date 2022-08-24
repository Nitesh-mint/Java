public class CommandLineInput {
    public static void main(String args[]){
        int a = Integer.parseInt(args[0]);//command line ma run garda input dinu parcha
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        System.out.println("The sum is:"+sum);
    }
}
