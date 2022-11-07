public class Method_Overriding{
    public static void main(String args[]){
        NicAisa b1 =  new NicAisa();
        SBI b2 = new SBI();
        NMB b3 = new NMB();
        Bank b0 = new Bank();
        System.out.println(b1.RateOfInterest());
        System.out.println(b2.RateOfInterest());
        System.out.println(b3.RateOfInterest());
        System.out.println(b0.RateOfInterest()); //calling parent class
    }
}
class Bank{
    int RateOfInterest(){
        return 0;
    }
}

class NicAisa extends Bank{
    int RateOfInterest(){
        return 1;
    }
}

class SBI extends Bank{
    int RateOfInterest(){
        return 2;
    }
}

class NMB extends Bank{
    int RateOfInterest(){
        return 3;
    }
}