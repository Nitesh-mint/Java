import java.util.Scanner;
public class seventeen {
    public static void main(String args[]){
        int num1,num2,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1: ");
        num1 = sc.nextInt();
        System.out.println("Enter the value of num2: ");
        num2 = sc.nextInt();
        sc.close(); // to remove the error sc is never closed.
        
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Num1 is "+num1);
        System.out.println("Num2 is "+num2);
    }
}
