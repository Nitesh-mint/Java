import java.util.Scanner;
public class SumScanner{
	public static void main(String args[]){
		int x,y,Sum;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the first number:");
		x =  sc.nextInt();
		System.out.println("Enter the first number:");
		y = sc.nextInt();
		Sum = x + y;
		System.out.println("The sum of two numbers x and y is:" + Sum);
	}
}
		