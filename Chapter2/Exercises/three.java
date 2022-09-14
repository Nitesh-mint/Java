import java.util.Scanner;
import java.lang.Math;
public class three {
    public static void main(String args[]){
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        //asking for values.
        System.out.println("Enter the value for a: ");
        a = sc.nextDouble();
        System.out.println("Enter the value for b: ");
        b = sc.nextDouble();
        System.out.println("Enter the value for c: ");
        c = sc.nextDouble();

        //d here is discriminant . if d is greater than 0 than eqn has real solution
        //if d is equal to 0 than roots are real and same
        // if d is less than 0 then roots are not real.

        double d = Math.pow(b,2)- 4.0*a*c;

        if(d<0){
            System.out.println("The roots are not real.");
        }
        else if(d == 0 ){
            double r1 = -b/(2.0*a);
            System.out.println("The root is:" + r1);
        }
        else{
        double r1 = (-b+Math.sqrt(d))/2*a;
        double r2 = (-b-Math.sqrt(d))/2*a;
        System.out.println("The roots are "+ r1 + " and " + r2);
        }
    }
}
