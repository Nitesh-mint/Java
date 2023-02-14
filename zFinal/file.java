import java.io.*;
public class file {
    public static void main(String[] args) throws IOException {
        FileInputStream f= new FileInputStream("in.txt");
        FileOutputStream o = new FileOutputStream("o.txt");
        int c;
        while((c=f.read())!=-1){
            o.write(c);
        }
        if(f!=null){
            f.close();
        }
        if(o!=null){
            o.close();
        }
    }
}
