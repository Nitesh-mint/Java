class Break{
    void out(){
        System.out.println("Printing From Break Statememt.");
        for(int a=0;a<5;a++){
            System.out.println(a);
            if(a==3){
                break;//executes 3 and only breaks.
            }
        }
    }
}


class Continue{
    void out(){
        System.out.println("Printing From Continue Statememt.");
        for(int a=0;a<=10;a++){
            if(a%2!=0){
                continue;
            }
            System.out.println(a);
        }
    }
}

public class breakAndContinue {
    public static void main(String args[]){
        Break oBreak = new Break();
        Continue oConitune = new Continue();
        oBreak.out();
        oConitune.out();

    }
}
