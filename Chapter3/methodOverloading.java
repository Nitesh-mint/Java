/* We can define same named method but with different parameters type or the parameter data. */     
public class methodOverloading{
    public int sum(int x, int y){
        return (x+y);
    }
    
    public int sum(int x, int y, int z){
        return (x+y+z);
    }
    public double sum(double x, double y){
        return (x+y);
    }    


    public static void main(String args[]){
        methodOverloading a = new methodOverloading();
        System.out.println(a.sum(5,6));
        System.out.println(a.sum(5,6,7));
        System.out.println(a.sum(5.9,6.1));
    }
}