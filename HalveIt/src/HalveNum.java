import java.util.Scanner;

public class HalveNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    System.out.println("enter the num");
    double num= scan.nextDouble();
      double res=halveTheNumber(num);
      System.out.printf("%.2f",res);
	}
	public static double halveTheNumber(double num)
	{
		return num/2.0;
	}
}
