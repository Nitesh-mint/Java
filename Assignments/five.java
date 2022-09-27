// largest element in an array 
import java.util.Scanner;
import java.util.Arrays; //importing this to sort the array
public class five {
    public static void main(String args[]){
        int size,num,i,arr[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        size = sc.nextInt();
        
        // defining size of the array
        arr= new int[size];

        System.out.println("Enter numbers");
        for(i=0;i<=size-1;++i){
            num=sc.nextInt();
            arr[i] = num;
        }

        Arrays.sort(arr); //sorting the array 
        
        //printing the last element of the sorted array
        System.out.println("The largest element in the array is: " + arr[size-1]);
    }
}
