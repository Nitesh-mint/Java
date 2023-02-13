interface a{
    abstract void name();
}
class b implements a{
    public void name(){
        System.out.println("This is class b");
    }
}
class c implements a{
    public void name(){
        System.out.println("This is class c");
    }
}

public class Inteerface {
    public static void main(String[] args) {
        a obj = new c();
        obj.name();
    }
}
