abstract class a{
    void nae(){
        System.out.println("This is a ");
    }
}
class b extends a{
    void name(){
        System.out.println("Nitesh");
    }
}
public class abstractClass {
    public static void main(String[] args) {
        b obj = new b();
        obj.name();
        a obj1 = new b();
        obj1.nae();
    }
}
