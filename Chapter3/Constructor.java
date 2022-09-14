class Const{
    String name;
    int age;
    String girlfriend;
    Const(){
        System.out.println("Constructing Box.");
        name = "Briyan";
        age = 21;
        girlfriend = "Brikiria";
    }
    void name(){
        System.out.println(name);
    }
}


public class Constructor {
    public static void main(String args[]){
        
        Const constructor1 = new Const();
        constructor1.name(); // calling methods.

    }
}
