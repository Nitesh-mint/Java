//calclator using swich case
import java.util.Scanner;
class calclator{
    void add(int a, int b){
        System.out.println(a+b);
    }
    void minus(int a, int b){
        System.out.println(a-b);
    }
    void divide(int a, int b){
        System.out.println(a/b);
    }
    void mult(int a, int b){
        System.out.println(a*b);
    }
}
public class calculator_switchCase{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice=1,num1,num2;
        // choice = sc.nextInt();
        calclator c = new calclator();
        while(choice>=1){
            int user;
            System.out.println("Enter the option you want to perform: ");
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Mutliplication");
            System.out.println("4) Division");
            user = sc.nextInt();
            // System.out.println("5) Exit");
            System.out.println("Enter two numbers :");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            switch(user){
                case 1:
                c.add(num1,num2);
                break;
                case 2:
                c.minus(num1,num2);
                break;
                case 3:
                c.mult(num1,num2);
                break;
                case 4:
                c.divide(num1,num2);
                break;
            }
        }

    }
}