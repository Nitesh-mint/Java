import java.io.FileWriter;
public class filewriter {
    public static void main(String args[]){
        try{
            FileWriter fw = new FileWriter("myfile.txt");
            fw.write("Damak Multiple Campus");
            fw.close();
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Success...");
    } 
}
