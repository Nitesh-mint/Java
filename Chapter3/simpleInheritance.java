public class simpleInheritance{
    public static void main(String args[]){
        B obj1 = new B();
        obj1.out();
    }
}

class A {
    void out(){
        System.out.println("This is A");
    }
}
class B extends A{

}