class returnClass{
    static int myReturnMethod(int x){
        return 5 + x;
    }
}


public class returnStatement {
    public static void main(String args[]){
        returnClass oReturn  = new returnClass();

        System.out.println(oReturn.myReturnMethod(5));
    }
}
