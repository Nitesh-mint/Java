class Cat{
    Cat(){
        String name = "Maya";
        String breed = "God";
        int age = 2;
        float size = 5;
        System.out.println(name);
        System.out.println(breed);
        System.out.println(age);
        System.out.println(size);
    }
}


public class DefaultConstructor {
    public static void main(String args[]){
        Cat maya = new Cat();
    }
}
