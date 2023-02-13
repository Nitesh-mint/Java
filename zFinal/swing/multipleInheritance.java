interface a{
    void display();
}
interface b{
    void name();
}
public class multipleInheritance implements a,b{
    public void display(){
        System.out.println("This is a display method");
    }
    public void name(){
        System.out.println("This is a name method");
    }
    public static void main(String[] args) {
        multipleInheritance obj = new multipleInheritance();
        obj.display();
        obj.name();
    }
}