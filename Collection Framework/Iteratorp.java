import java.util.ArrayList;
import java.util.Iterator;
public class Iteratorp {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(5);   
        arr.add(6);   
        arr.add(4);   
        Iterator<Integer> i = arr.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println();
    }
}
