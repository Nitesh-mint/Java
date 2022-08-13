public class enhancedLoop {
    public static void main(String args[]){
        int [] numbers = {10,20,30,40};

        for(int x: numbers){
            System.out.print(x);
            System.out.print(",");

        }
        System.out.println("\n");
        String [] names = {"Nitesh","Ritika"};
        for(String n: names){
            System.out.print(n);
            System.out.print(",");
        }
    }
}
