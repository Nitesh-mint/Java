import java.io.*;
public class inputOutputReaderWrite {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        try{
            in = new FileReader("input.txt");
            out = new FileWriter("out.txt");
            int c;
            while((c=in.read())!=-1){
                out.write(c);
            }
        }finally{
            if(in !=null){
                in.close();
            }
            if(out != null){
                out.close();
            }
        }
    }
}
