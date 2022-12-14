//program to calculate simple interest, factorial and fibonacci series
import java.util.Scanner;
public class test {
    Scanner sc = new Scanner(System.in);
    void simple_interest(){
        float p,t,r,simple_interest;
        System.out.println("Enter the value of principle:");
        p = sc.nextFloat(); 
        System.out.println("Enter the value of Time:");
        t = sc.nextFloat();
        System.out.println("Enter the value of Rate:");
        r = sc.nextFloat();
        simple_interest = (p*t*r)/100;
        System.out.println("THe simple interest is: "+simple_interest);
    }
    void factorial(){
        int n,fact=1;
        System.out.println("Enter the number to find factorial of: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("The factorial of "+n+" is "+ fact);
    }
    void fibonacci(){
        int n,firstTerm=0,secondTerm=1;
        System.out.println("Enter the number to find fibonacci: ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm; 
        }
    }
    public static void main(String args[]){
        test T = new test();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:");
        System.out.println("1.Calculate Simple Interest");
        System.out.println("2.Calculate Factorial");
        System.out.println("3.Calculate Fibonacci");
        System.out.println("4.Exit");
        int choice;
        choice = sc.nextInt();
        sc.close();
        switch(choice){
            case 1:
            T.simple_interest();
            break;
            
            case 2:
            T.factorial();
            break;

            case 3:
            T.fibonacci();
            break;

            case 4:
            break;
        }
    }
}