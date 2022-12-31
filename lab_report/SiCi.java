// ptr/100 P + [1+ R/100]^t - P;
import java.util.Scanner;
class m{
    float simpleInterest(int p,float r, float t){
        return (p* r * t)/100;
    }
    double CompoundInterest(int a, float b, float c){
        double ci;
        ci = a *(Math.pow((1+b/100),c));
        return ci;
    }
}
public class SiCi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        int principle;
        float rate, time;
        System.out.println("Enter Principle, rate and time :");
        principle = sc.nextInt();
        rate = sc.nextFloat();
        time = sc.nextFloat();
        sc.close();
        m obj = new m();
        System.out.println(obj.simpleInterest(principle, rate, time));
        System.out.println(obj.CompoundInterest(principle, rate, time));
    }
}
