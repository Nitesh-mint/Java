class Const{
    Const(){
        System.out.println("Default constructor.");
    }
    Const(String name){
        System.out.println(name);
    }
}
public class Constructor {
    public static void main(String args[]){
        
        Const constructor1 = new Const();
        Const constructor2 = new Const("Nitesh");
    }
}
