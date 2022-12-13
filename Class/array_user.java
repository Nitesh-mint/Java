import java.util.Scanner;

public class array_user {
    public static void main(String args[]){
        int n,num,temp;
        int arr[];
        System.out.println("Enter the size of array :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for(int i=0;i<n;i++){   
            System.out.println("Enter the number: ");
            num = sc.nextInt();
            arr[i] = num;
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        sc.close();
        System.out.println("Printing....");
        for(int a=0;a<n;a++){
            System.out.println(arr[a]);
        }
    }
}
