class overriding{
    void out(){
        System.out.println("This is overriding class");
    }
}


public class method_overriding extends overriding {
    void out(){
        System.out.println("This is public class");
    }
    overriding obj = new overriding();
    super.out();
}
