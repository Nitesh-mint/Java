public class nestedIfElse {
    public static void main(String args[]){
        int a=1,b=2,c=3;
        if (a<b){
            if(b<3){
                if(c>a&& c>b){
                    System.out.println("3 is greater than all of them.");
                }
                else{
                    System.out.println("Java is broken.");
                }
            }
        }
    }
}
