import java.util.ArrayList;
import java.util.Iterator;
public class Iteratorp {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int ar[] = {5,6,7,8,9};
        arr.add(5);   
        arr.add(6);   
        arr.add(4);   
        Iterator<Integer> j = arr.iterator();
        // while(i.hasNext()){
        //     System.out.println(i.next());
        // }
        // System.out.println();
        Iterator<Integer> k = arr.iterator();
        while(k.hasNext()){
            System.out.println(k.next());
        }
    }
}
