import java.util.*;

class primeNos
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int count,divider,num,prime;
		System.out.println("Enter the number till which you want prime numbers");
    		num=sc.nextInt();
    		System.out.println("Prime numbers are :-");    
    
		for(count=2;count<=num;count++){
        		prime=0;
        		for(divider=1;divider<=count;divider++)
        		{
        	    		if(count%divider==0)
        	    		{   
        	        		prime++;
        	    		}
        		}
       			if(prime==2)
       			{
        		    System.out.print(count+" ");
        		}
    		}
	}
}
