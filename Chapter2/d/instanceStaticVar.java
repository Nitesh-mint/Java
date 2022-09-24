class instanceVar{
    public String name = "";//declared instance variables
    void Nitesh(){
        name = "Nitesh";
        System.out.println(name);
    }
}

class staticVar{
    public static  String thar = ""; // declared static variable\

    //Thar method 
    void Thar(){
        staticVar.thar = " Raya"; //accessing static varaible
        thar = "Nothing";
        System.out.println(staticVar.thar);
        
    }
}

public class instanceStaticVar{
    public static void main(String args[]){
        instanceVar oName = new instanceVar();
        staticVar oThar = new staticVar();
        oName.Nitesh();
        oThar.Thar();
    }
}