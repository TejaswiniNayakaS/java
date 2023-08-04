package level5;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for(int i=1;i<=3;i++)
      {
    	  if(i==1)
    	  {
    		  for(int t=1;t<=4;t++)
    		  {
    			  System.out.print(" ");
    		  }
    		  System.out.print("*");
    	   }
    	  
    	  else if(i==2)
    	  {
    		  for(int k=1;k<=2;k++)
    		  {
    			  System.out.print(" *");
  
    		  
    		  for(int h=1;h<=4;h++)
    		  {
    			  System.out.print(" ");
    		  }
    	   }
    	  }
    	  else if(i==3)
    	  {
    		  for(int k=1;k<=5;k++)
    		  {
    			  System.out.print("* ");
    		  }
    	  } 
    	  System.out.println();
      }
	}

}
