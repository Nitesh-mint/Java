import java.util.Scanner;

import javax.swing.text.StyledEditorKit;
public class PrimeNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int userNumber,divider=2;
		boolean prime = true;
		System.out.println("Enter the Number of prime:");
		userNumber = sc.nextInt();

		while(divider<=userNumber/2){
			//condition for non-prime
			if(userNumber == 1){
				System.out.println("Prime");
			}
			else if(userNumber%divider==0){
				prime = false;
				break;
			}
			++divider;
		}
		if(prime){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not prime.");
		}
	}
}