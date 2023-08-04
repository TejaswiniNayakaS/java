import java.util.Scanner;

public class Sol6 {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("enter the number");
			Scanner scan = new Scanner(System.in);
			 int n =scan.nextInt();
			 int count=0;
			 for(int i=2;i<n;i++)
			 { 
				 int res=isprime(i);
				 if(res!=0) {
			     System.out.println(res);
				   count++;
			 }
			 }
			 System.out.println("the count is"+count);
		}
			 public static int isprime(int n)
			 {
				 
				 for(int i=2;i<n;i++)
				 {
					 if(n%i==0)
					 {
						 return 0 ;
					 }
				 }
				 return n;
				 
			 }
	}


