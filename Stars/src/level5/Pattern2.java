package level5;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for(int i=1;i<=5;i++) {
    	  if(i==1||i==5) 
    	  {
    	        for(int j=1;j<=5;j++)
    	        {
    		  System.out.print("* ");
    	       }
    	 }
    	  else {
    		  for(int k=1;k<=2;k++)
    		  {
    			  System.out.print("*");
    			  for(int p=1;p<=7;p++)
    			  {
    				  System.out.print(" ");
    			  }
    		  }
    		  
    	  }
    	  System.out.println();
      }
	}

}
