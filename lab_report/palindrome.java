import java.util.Scanner;
public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String original;
        String reversed = "";
        original = sc.next();
        sc.close();
        for(int i=0;i<original.length();i++){
            reversed = original.charAt(i) + reversed;
        }
        if(original.equalsIgnoreCase(reversed)){
            System.out.println("The word is palindrome");
        }
        else{
            System.out.println("The word is not palindrome");
        }
    }
}
