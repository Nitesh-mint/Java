import java.util.Scanner;
public class PrimeNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int userNumber,divider=2;
		boolean prime = true;
		System.out.println("Enter the Number of prime:");
		userNumber = sc.nextInt();
		while(divider<=userNumber/2){
			//condition for non-prime
			if(userNumber%divider==0){
				prime = false;
				break;
			}
			++divider;
		}
		if(prime){
			System.out.println(userNumber);
		}
		else{
			System.out.println("Not prime.");
		}
	}
}