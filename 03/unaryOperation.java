public class unaryOperation{
    public static void main(String args[]){
        int a  = 10;
        int b  = 10;
        System.out.println(a++ + ++a);//10 + 11+1 = 22
        System.out.println(b++ + b++);//10 + 11 = 21
    }
}