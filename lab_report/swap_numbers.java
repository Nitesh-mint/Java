import java.util.Scanner;
public class swap_numbers {
    public static void main(String args[]){
        int a,b,swap;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value two numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        System.out.println("The numbers before swapping are: " + a + " and "+ b );
        swap = a;
        a = b;
        b = swap;
        System.out.println("The numbers after swapping are: " + a + " and "+ b );
    }
}
