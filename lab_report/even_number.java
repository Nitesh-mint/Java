import java.util.Scanner;
public class even_number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter num : ");
        n = sc.nextInt();
        for(int i=0; i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}