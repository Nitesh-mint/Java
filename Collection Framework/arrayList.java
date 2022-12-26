import java.util.ArrayList;
    public class arrayList{
        public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int i=1;i<=5;i++){
            ar.add(i);
        }
        System.out.println(ar);
        ar.remove(1);
        System.out.println(ar);
    }
}