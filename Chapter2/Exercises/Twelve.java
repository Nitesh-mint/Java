import java.util.Scanner;

public class Twelve {
    public static void main(String args[]){
        int i=0;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int input;
        input = sc.nextInt();
        for(;i<=10;){
            System.out.println(input+ " X " + i + " is " + input*i);
            i++;
        }
    }
}

