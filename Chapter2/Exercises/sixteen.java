
import java.util.Scanner;
public class sixteen {
    public static void main(String args[]){
        double PI = 3.14285714286;
        double radius, volume, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere:");
        radius = sc.nextDouble();
        area = 4.0 * PI * Math.pow(radius,2.0);
        area = Math.round(area * 100.0)/100.0; //to round to 2 decimal number
        System.out.println("The are of the sphere is:" +area);

        volume = (4.0/3.0) * PI * Math.pow(radius,3.0);
        volume = Math.round(volume*100.0)/100.0; // to round to 2 decimal number
        System.out.println("The volume of the sphere is: "+volume);
        
    }
}
