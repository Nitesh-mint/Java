//print vowel or consonant.and show error if input is not between character.
import java.util.Scanner;
public class eleven {
    public static void main(String args[]){
        char input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character between a-z or A-Z");
        input = sc.next().charAt(0); // to read the first letter.
        char vowel[] = {'a','e' ,'i', 'o', 'u'};
        if((input >='a' && input<='z') || (input>='A' && input<='Z')){
            System.out.println(input+" is alphabet.");
            for(char x: vowel){
                if(input == x){
                    System.out.println(input+ " is vowel.");
                }
            }
        }
        else{
            System.out.println("Nothig other than character is valid.");
        }
        }
}
