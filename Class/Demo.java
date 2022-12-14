import java.util.Scanner;
public class Demo{
	public static void main(String args[]){
		int i,j;
		Scanner in =  new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n =  in.nextInt();
		int [] array = new int[n];
		

		
		System.out.println("Enter the elements of the array:");
		for(i=0;i<n;i++){
			array[i] = in.nextInt();
		}
		in.close();

		System.out.println("Array are: ");
		for(i=0; i<n;i++){
			System.out.println(array[i]);
		}
	}
}
	