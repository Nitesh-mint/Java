import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bReader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        try{
            String name = reader.readLine();
            System.out.println("HI "+ name);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
