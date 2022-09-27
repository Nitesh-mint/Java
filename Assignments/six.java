//sort the element of an array in ascending order
import java.util.Scanner;
import java.util.Arrays; //importing this to sort the array
public class six {
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

        for(i=0;i<=size-1;++i){
            System.out.print(arr[i] + " ");
        }
    }
}