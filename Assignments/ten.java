class Methods_example{
    String Name;
    // creating instance method 
    public void Display_name(String name){
        this.Name = name;
        System.out.println(Name);
    }

    //creating static variable 
    public static int Age;
    //creating static method
    public static void Dipslay_Age(int age){
        Age = age;
        System.out.println(Age);
    }
}

public class ten {
    public static void main(String args[]){
        //static method can be accessed wihtout creatin or by creating objects.
        Methods_example.Dipslay_Age(20); //didnot create an object

        //instance can only be accessed by creating objects.
        Methods_example instance_method = new Methods_example();
        instance_method.Display_name("Nitesh");
    }
}
