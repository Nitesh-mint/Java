//reverese of a string
import java.util.Scanner;
public class reverse_string{
    public static void main(String args[]){
        String original;
        String reversed ="";
        Scanner sc = new Scanner(System.in);
        original = sc.next();
        sc.close();
        for(int i=0;i<original.length();i++){
            reversed = original.charAt(i) + reversed;
        }
        System.out.println(reversed);
    }
}