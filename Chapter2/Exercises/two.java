//2 number question from book!
import java.util.Scanner; //to get user input;\

public class two {
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        //codition for positive or negative
        if(num<0){
            System.out.println("The number is negative.");
        }
        else{
            System.out.println("The number is postive.");
        }
    }
}
