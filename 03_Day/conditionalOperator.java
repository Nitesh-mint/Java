// variable x = (expression)? value if true: value if false
public class conditionalOperator{
    public static void main(String args[]){
        int a = 50;

        int b = (a == 1)? 20: 30; //false so b is 30
        System.out.println("The value of b is: " + b);

        b = (a == 50)? 20:30 ; //true so b is 20
        System.out.println("The value of b is:"+ b);
    }
}