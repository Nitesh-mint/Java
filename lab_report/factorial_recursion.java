import java.util.*;
public class factorial_recursion {
    static int fact(int a){
        int n = a, res=1;
        if(n>0){
            res = n * fact(n-1);
        }
        return res;
    }
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        System.out.println("Enter the number to get factorial of: ");
        System.out.println(fact(num));
    }
}
