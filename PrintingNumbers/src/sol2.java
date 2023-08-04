import java.util.Scanner;

public class sol2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner scan = new Scanner(System.in);
		 int n =scan.nextInt();
		div3Num(n);
		
	}
	 public static void div3Num(int num) {
		 for(int i=1;i<=num;i++)
		 {
			 if(i%3==0)
			 {
				 System.out.println(i);
			 }
		 }
	}

}
