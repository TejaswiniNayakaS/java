import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the num");
        int n= scan.nextInt();
         int res=sumOfNum(n);
         System.out.println("Sum  "+res);
	}
	public static int sumOfNum(int num)
	{
		int sum=0;
		
		while(num!=0)
		{
			
			int m=num%10;
			sum= sum+m;
			num=num/10;
		}
		return sum;
		
	}

}
