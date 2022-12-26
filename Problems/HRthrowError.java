import java.util.Scanner;
public class HRthrowError{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int height,breadth;
        height = sc.nextInt();
        breadth = sc.nextInt();
        sc.close();
        if(height <=0 || breadth <=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else{
            System.out.println(height * breadth);
        }
    }
}