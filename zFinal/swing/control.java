// abstract class (0-100)abstraction
// interface 100%(abstraction)
abstract class a{
    abstract void name();
}
class b extends a{
    void name(){
        System.out.println("This is class b");
    }
}
class c extends a{
    void name(){
        System.out.println("This is class c");
    }
}
public class control{
    public static void main(String[] args) {
        a obj = new c();
        obj.name();
    }
}

