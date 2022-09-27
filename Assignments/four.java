import java.lang.StringBuilder;
import java.util.Scanner;

public class four {
    public static void main(String args[]){
        String input,a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        input = sc.next();
        sc.close();

        //reverse the string
        StringBuilder Reverse = new StringBuilder();
        Reverse.append(input);

        a = String.valueOf(Reverse.reverse());
        
        if(input.equalsIgnoreCase(a)){
            System.out.println("The word is palindrome.");
        }
        else{
            System.out.println("The word is not palindrome.");
        }
    }

}
