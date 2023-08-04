
public class ArmStrong {

		    static int  counting(int n) {
		    	int count=0;
		    	while(n!=0)
		    	{
		    		int rem=n%10;
		    		count++;
		    		n=n/10;
		    	}
		    	return count;
		    }
		    public static int arm(int digit,int n)
		    {
		    	int  sum=0;
		    	while(n!=0)
		    	{
		    		int rem=n%10;
		    		sum= (int)(sum+ Math.pow(rem, digit));
		    		n=n/10;
		    	}
		    	return sum;
		    	
		    }
		

	}


