import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the num");
        int n= scan.nextInt();
        fibno(n);
        
	}
	public static void fibno(int n)
	{
		int fib1=0;
		int fib2=1;
		if(n==1)
		{
			System.out.println(fib1+" ");
		}
		else if(n==2)
		{
			System.out.print(fib1+" "+fib2);
		}
		else
		{
			int i=1;
			System.out.print(fib1+" "+fib2);
			while(i<=n)
			{
				int next=fib1+fib2;
				System.out.print(" "+next);
				fib1=fib2;
				fib2=next;
				i++;
			}
		}
	}

}
