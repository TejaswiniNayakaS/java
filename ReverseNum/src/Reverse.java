
public class Reverse {
  public static int rev (int n)
  {int rev=0;
	  while(n!=0)
	  {
		  
		  int m=n%10;
		  rev=rev*10+m;
		  n=n/10;
		  
	  }
	  return rev;
  }
}
