import java.util.LinkedList;
public class linkedList{
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        //adding 
        ll.add(5);
        ll.add(6);
        ll.add(1,2);
        System.out.println(ll);
        System.out.println(ll.getFirst());
        ListNode head = new ListNode();

    }
}