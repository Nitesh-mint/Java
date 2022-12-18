class Shape{
    void Dipslay(){
        System.out.println("This is This is shape");
    }
}
class Recatangle extends Shape{
    void Show(){
        System.out.println("This is Rectangle");
    }
    class Square{
        void Show(){
            System.out.println("Square is a rectangle");
        }
    }
}
class Circle extends Shape{
 void Show(){
    System.out.println("This is Circle");
 }
}
public class nine {
    Recatangle s = new Recatangle();
}
