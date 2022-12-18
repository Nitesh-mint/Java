class constructor{
    int first,second;
    constructor(int a, int b){
        first = a;
        second = b;
        System.out.println(a*b);
    }
}


public class parameterized_constructor {
    public static void main(String ars[]){
        constructor c = new constructor(5,6);// no need to call the method.
    }
}
