 import java.util.*;
public class Sol1{
	public static void main(String []args) {
		System.out.println("enter the number");
		Scanner scan = new Scanner(System.in);
		 int n =scan.nextInt();
		 evenNum(n);
		
	}
	 public static void evenNum(int num) {
		 for(int i=1;i<=num;i++)
		 {
			 if(i%2==0)
			 {
				 System.out.println(i);
			 }
		 }
	 }
	 
}
