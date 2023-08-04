import java.util.Scanner;

public class Sol8 {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("enter the number");
			Scanner scan = new Scanner(System.in);
			 int n =scan.nextInt();
			 oddandDiv5Num(n);
	}
		 public static void oddandDiv5Num(int num) {
			 for(int i=1;i<=num;i++)
			 {
				 if(i%2!=0 && i%5==0)
				 {
					 System.out.println(i);
				 }
			 }
		}

}
