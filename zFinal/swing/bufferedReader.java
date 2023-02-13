import java.io.FileReader;

import java.io.BufferedReader;
import java.io.IOException;
// import java.io.FileReader;
public class bufferedReader{
    public static void main(String[] args) {
        String filename = "example.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}