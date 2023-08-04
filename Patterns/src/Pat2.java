
public class Pat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for(int i=1;i<=5;i++)
       {
    	   if(i==1)
    	   {
    		   System.out.print("*");
    	   }
    	   else		 
    	   for(int h=1;h<=2;h++)
    	   {
    		   System.out.print("*");
    		   for(int l=1;l<=i-1;l++)
    		   {
    			   System.out.print(" ");
    		   }
    	   }
    	   System.out.println();
       }
       
       for(int i=1;i<=6;i++)
       {
    	   if(i==6)
    	   {
    		   System.out.print("*");
    	   }
    	   else		 
    	   for(int h=1;h<=2;h++)
    	   {
    		   System.out.print("*");
    		   for(int l=5;l>=i;l--)
    		   {
    			   System.out.print(" ");
    		   }
    	   }
    	   System.out.println();
       }
	}

}
