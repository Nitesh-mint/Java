// program to reverese a string
import java.lang.StringBuilder;
import java.util.Scanner;

public class two {
    public static void main(String args[]){
        String input; 
        Scanner sc = new Scanner(System.in); //creating scanner object
        System.out.println("Give a word as input:");
        // storing string
        input = sc.next();

        //now using StringBuilder Function
        StringBuilder reverse = new StringBuilder();
        reverse.append(input); //store all the inputed string to reverse

        reverse.reverse(); //reverse all the characters
        System.out.println(reverse);
    }
}
