import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan= new Scanner(System.in);
         System.out.println("enter twoo numbers");
        int  m= scan.nextInt();
        int  n= scan.nextInt();
          int res=findGcd(m,n);
          System.out.println("GCD ="+res);
         
	}
	 static int findGcd(int m,int n)
	 {
		 while(n!=0)
		 {
			 int rem=m%n;
			 m=n;
			 n=rem;
			 
		 }
		 int gcd= m;
		 return gcd;
	 }

}
