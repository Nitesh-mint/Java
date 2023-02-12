//using file input stream OF ByteStream Classs
import java.io.*; //first import this to use the classes and methods
public class inputOutput {
    public static void main(String[] args)throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("input.txt") ;//The file to be inputted
            out = new FileOutputStream("output.txt"); // this file will be created
            int c; //to iterate through the data int the input.txt
            while((c=in.read())!=-1){ //in bhanne object ma empty chaina bhane
                out.write(c); //c ma store bhako kura lai out object ma write 
            }
        }
        finally{
            if(in != null){ //input.txt empty thena bhane teslai close garnu parcha so
                in.close();
            }
            if(out!=null){ //same for the output.txt
                out.close();
            }
        }
    }
}
