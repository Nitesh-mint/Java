public class fourteen {
    public static void main(String args[]){
        long i = 1;
        for(int a=1;a<=11;a++){
            i = a * i;
            if(a==11){
                System.out.println(i);
                i=1;
                break;
            }
        }

        for(int a=1;a<=12;a++){
            i = a * i;
            if(a==12){
                System.out.println(i);
                i=1;
                break;
            }
        }

        for(int a=1;a<=13;a++){
            i = a * i;
            if(a==13){
                System.out.println(i);
                i=1;
                break;
            }
        }
    }
}
