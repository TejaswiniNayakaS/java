package level4;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int i=1;i<=5;i++)
         {
        	 for(int h=1;h<=i;h++)
        	 {
        		 System.out.print(" ");
        	 }
        	 for(int j=1;j<=i;j++)
        	 {
        		 System.out.print("*");
        	 }
        	 
        	 
        	 System.out.println();
         }
		 for(int i=1;i<=4;i++)
         {
			 for(int j=4;j>=i;j--)
        	 {
        		 System.out.print(" ");
        	 }
        	 for(int h=4;h>=i;h--)
        	 {
        		 System.out.print("*");
        	 }
        	 
        	 System.out.println();
         }
	}

}
