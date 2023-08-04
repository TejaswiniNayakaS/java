import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enterthe number");
		int n=scan.nextInt();
		int digits =ArmStrong.counting(n);
		int res=ArmStrong.arm(digits,n);
		if(res==n)
		{
			System.out.println("Its is ArmStrong "+res);
		}
		else
		{
			System.out.println("Not an ArmStrong");
		}

	}

}
