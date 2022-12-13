import java.util.Scanner;
public class loopsTwo{
    static int f = 0;
    static void result(int a, int b, int c, int temp){
        int res = a + temp *2;
        System.out.printf("%d", res+f);
        f = res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<=t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int temp = 1;
            for(int e=1;e<=c;e++){
                result(a, b, c, temp);
                temp = temp * 2;
            }
        }
        sc.close();
    }
}