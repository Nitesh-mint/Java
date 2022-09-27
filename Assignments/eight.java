//program to demonstrate use of parameterized constructor
public class eight {
    String name;
    int age;
    //creating constructor
    eight(int i, String a){ 
        name = a;
        age = i;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String args[]){
        //creating objects from the class
        eight Employee1 = new eight(20,"Nitesh"); //passing values to the parametarized constructor
        Employee1.display();

    }
}
