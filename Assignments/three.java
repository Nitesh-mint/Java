//Fibonnaci series up to n numbers
import java.util.Scanner;
public class three {
    public static void main(String args[]){
        int a=0,b=1,temp,n,i;
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        System.out.print(a + " " + b);
        for(i=2;i<n;++i){
            temp = a+b;
            a = b;
            b = temp;
            System.out.print(" " + temp);
        }
    }
}
