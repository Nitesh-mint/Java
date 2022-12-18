import java.util.Scanner;
import java.lang.Math;
public class roots {
    public static void main(String args[]){
        double b,a,c;
        Scanner sc = new Scanner(System.in);
        b = sc.nextDouble();
        a = sc.nextDouble();
        c = sc.nextDouble();
        sc.close();
        double first_root,second_root;
        first_root = (2 * Math.sqrt(b*b - 4*a*c))/2*a;
        second_root = (-2 * Math.sqrt(b*b - 4*a*c))/2*a;
        System.out.println("The roots of the equations are : " + first_root + "  " + second_root);
    }
}
