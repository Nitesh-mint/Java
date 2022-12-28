import java.util.Scanner;
public class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ;
        a = sc.nextInt();
        sc.close();
        for(int i=1;i<=a;i++){
            if(a%i==0 && i<a && i>1){
                System.out.println("Not prime");
                break;
            }
            if(i==a){
                System.out.println("Prime");
                break;
            }
        }
    }
}