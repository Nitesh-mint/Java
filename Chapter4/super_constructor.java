class Parentclass{
    Parentclass(){
        System.out.println("This is parent class");
    }
}
public class super_constructor extends Parentclass {
    super_constructor(){
        super();
        System.out.println("Constructor of child class.");
    }
    public static void main(String ars[]){
        super_constructor s = new super_constructor();
    }
}
