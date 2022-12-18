public class static_instance_method {
    void instance(){//instance method
        System.out.println("This is an instance method.Created Object to call them");
    }
	static void name(){//static method
        System.out.println("This is instance method");
    }
    public static void main(String args[]){//static method
        static_instance_method s = new static_instance_method();
        s.instance();//called the method
	  static_instance_method.name();
    }
}
