import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
System.out.println("enter the number");
       int n=scan.nextInt();
       int res=Reverse.rev(n);
       if(res==n) {
    	   System.out.println("Palindrome  "+res);
       }
       else {
    	   System.out.println("Its not palindrome");
       }
       
	}

}
