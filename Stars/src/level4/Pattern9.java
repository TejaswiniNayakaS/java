package level4;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
        {
			 for(int j=5;j>=i;j--)
       	 {
       		 System.out.print(" ");
       	 }
       	 for(int h=1;h<=5;h++)
       	 {
       		 System.out.print("*");
       	 }
       	 
       	 System.out.println();
        }
		for(int i=1;i<=5;i++)
        {
			for(int j=1;j<=i;j++)
	       	 {
	       		 System.out.print(" ");
	       	 }
			for(int h=1;h<=5;h++)
	       	 {
	       		 System.out.print("*");
	       	 }
	       	 
			 
       	 
       	 System.out.println();
        }

	}

}
