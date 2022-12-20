public class Bank{
    void deposit(){
        System.out.println("This is Deposit Method");
        System.out.println("Depositing amount");
     }
    void withdraw(){
        System.out.println("This is Deposit Method");
        System.out.println("Withdrawing amount");
    }
    public static void main(String args[]){
        Bank NIC = new Bank();
        NIC.deposit();
        // NIC.withdraw();
    }
}
