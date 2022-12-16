package Chapter5;

public class exception_a {
    public static void main(String args[]){
        try{
            int a[] = new int[10];
            System.out.println("Access element in three: "+ a[11]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exection thrown: " + e);
        }
        System.out.println("Out of the block");
    }
}
