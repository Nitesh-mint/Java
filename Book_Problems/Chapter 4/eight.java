class Rectangle{
    int length,breadth;
    Rectangle(int lenght, int breadth){
        this.length = lenght;
        this.breadth = breadth;
    }
    int area(){
        return length + breadth;
    }
    int perimeter(){
        return 2*(length+breadth);
    }
}
class square  extends Rectangle{
    square(int length, int breadth){
        super(length,breadth);
    }
    int area(){
        return length * length;
    }
    int perimeter(){
        return length + breadth;
    }
}
public class eight{
    public static void main(String args[]){
        Rectangle r = new Rectangle(5,6);
        System.out.println(r.area());
        square s = new square(5, 6);
        System.out.println(s.area());
    }
}