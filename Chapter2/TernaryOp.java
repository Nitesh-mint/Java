import java.util.Scanner;
public class TernaryOp {
   public static void main(String args[]){
    String a = "Nitesh";
    String love = " Loves";
    String b = " Dogs";
    String out = a + love +  b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Guess a number between 1 and 5:");
    int user = sc.nextInt();

    //this is a ternary operation
    out  = 5 == user?out:"No They hate each other.";
    System.out.println(out);
   } 
}
