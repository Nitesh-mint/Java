public class hieriaciral{
    public static void main(String args[]){
        C obj1 = new C();
        obj1.out();
        obj1.not
    }
}

class A{
    void out(){
        System.out.println("This is A");
    }
}

class B extends A{
    void notout(){
        System.out.println("This is B");
    }
}
class C extends A{
    void nout(){
        System.out.println("This is c");
    }
}