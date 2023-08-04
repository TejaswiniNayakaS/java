import java.util.*;
public class Main

{

public static void checkGrade(int grade)

{
	if(grade>50)
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}

}

public static void main(String[] args)

{
	Scanner scan =new Scanner(System.in);
 System.out.println("enter the grade");
 int n= scan.nextInt();
 checkGrade(n);
 
}
}