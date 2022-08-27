import java.util.Scanner;
public class userInput {
    public static void main(String ars[]){
        int a,b;
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the value of a.");
        a = c.nextInt();

        System.out.println("Enter the value of b.");
        b = c.nextInt();

        System.out.println("The sum of a and b is:" + a*b);
        String z = "How to how"; //creating a string 
        System.out.println("The highest value is:"+Math.max(a,b));
        System.out.println("The highest value is:"+Math.min(a,b));

    }
}
