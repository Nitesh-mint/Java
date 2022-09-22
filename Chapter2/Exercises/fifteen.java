public class fifteen {
    public static void main(String args[]){
        int a = 0,b=1,c,d=0;
        System.out.printf(a+" "+b);
        for(int i=2;i<10;i++){
            c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;
            d = a+b;
        }
        System.out.println("The average is:" + d/2);
    }
}
