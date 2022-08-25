//created a class.
class dog{ 
    //instance variables.
        int size; 
        String breed;
        String name;
    // create a bark method

    void bark(){
        System.out.println("Bhaw Bhaw");
    }
}

public class dogClass{
    public static void main(String args[]){
        dog odog = new dog(); // creating odog object from the class.
        odog.bark();
    }
}