// this is an example of super keyword
class person {
    void message(){
        System.out.println("This is person class.");
    }
}
class Student extends person{
    void message(){
        System.out.println("This is a student class");
    }
    void display(){
        message(); //this class message inside student class
        super.message(); //this class message of the parent class
    }
}
public class super_class{
    public static void main(String args[]){
        Student s = new Student();
        s.display();
    }
}