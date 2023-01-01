abstract class a{
    void name(){
        System.out.println("This is a interface"); 
    }
}


interface i{

}
class j implements i{
    void name(){
        System.out.println("This is child class j");
    }
}

class k extends a{

}

public class iinterfce {
    public static void main(String[] args) {
        j obj = new j();
        obj.name();
    }
}
