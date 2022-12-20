//prime numbers between two intervals
import java.util.Scanner;
public class primeNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        for(int i=a;i<=b;i++){
            for(int j=1;j<=i;j++){
                if(j==i){
                    System.out.print(j + " ");
                }
                else if(j>1 &&i%j==0){
                    break;
                }
            }
        }
    }
}