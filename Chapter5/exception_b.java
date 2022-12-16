//program of java multi-catch block
public class exception_b {
    public static void main(String args[]){
        try{
            int arr[]= new int[7];
            arr[] = 30/5;
            System.out.println("Last Statement of try block");
        }
        catch(ArithmeticException e){
            System.out.println("You should not divide a number by zero.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Accessing array elements outside of the limit.");
        }
        catch(Exception e){
            System.out.println("Some other Exception");
        }
        System.out.println("Out of the try-catch block");
    }
}
