public class operatorPrecendence {
    public static void main(String args[]){
        int a = 1;
        int b = 2;
        int c= 4;
        int something = c/b*a%3; // * first / and then %
        System.out.println(something);
    }
}
