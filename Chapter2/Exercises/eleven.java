//print vowel or consonant.and show error if input is not between character.
import java.util.Scanner;
public class eleven {
    public static void main(String args[]){
        char input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character between a-z or A-Z");
        input = sc.next().charAt(0); // to read the first letter.
        char array[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char vowel[] = {'a','e' ,'i', 'o', 'u'};

        
        for (char x : array){
            if(input != x){
                System.out.println(input+ " is not valid.");
                break;
            }
            else{
                for(char y: vowel){
                    if(input == y){
                        System.out.println("The letter is valid.");
                    }
                    else{
                        System.out.println("The letter is consonant.");
                    }
                }
            }

            }
        }
}
