//created a class.
class dog{ 
    //instance variables.
        int size; 
        String breed;
        String name;
    // create a bark method

    void Breed(int a, String b , String c){
        this.size = a;
        this.name = b;
        this.breed = c;

        System.out.println(size);
        System.out.println(name);
        System.out.println(breed);

    }

    void bark(){
        System.out.println("Bhaw Bhaw");
    }
}

public class dogClass{
    public static void main(String args[]){
        dog bhunte = new dog(); // creating odog object from the class.
        bhunte.Breed(4,"Bhunte","Bhusiya");
        bhunte.bark();
    }
}