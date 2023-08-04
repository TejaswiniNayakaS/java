import java.util.*;
public class Main

{

public static void checkMultipleOfTen(int n)

{
  if(n%10==0)
  {
	  System.out.println("It is divisible by 10");
  }
  else
  {
	  System.out.println("no");
  }


}

public static void main(String[] args)
{
  System.out.println("enter the number");
  Scanner scan =new Scanner(System.in);
  int n= scan.nextInt();
  checkMultipleOfTen(n);
}

}