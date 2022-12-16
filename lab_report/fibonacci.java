import java.util.Scanner;
public class fibonacci {
    public static void main(String args[]){
        int number,first_number=0,second_number=1;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();
        for(int i=1;i<=number;i++){
            System.out.print(first_number + ", ");
            int next = second_number + first_number;
            first_number = second_number;
            second_number = next;
        }
    }
}
