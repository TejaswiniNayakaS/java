import java.util.Scanner;

public class Sol9{
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("enter the number");
			Scanner scan = new Scanner(System.in);
			 int n =scan.nextInt();
			 for(int i=3;i<n;i++)
			 {
				 isprime(i);
			 }
		}
			 public static void isprime(int num)
			 {
				 for(int i=2;i<num;i++)
				 {
					 if(num%i==0)
					 {
						 return;
					 }
				 }
				 if(num%2==0) {
				 System.out.println(num);
				 }
				 
			 }
	}



