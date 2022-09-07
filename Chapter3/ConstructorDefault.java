class constructor{
    constructor(){ //this constructor gives output wihout calling it.
        System.out.println("This is an example of inside constructor.");
    }
}


public class ConstructorDefault {
    public static void main(String args[]){
    constructor con = new constructor(); //only the creation of the object is enough.
    }
}
