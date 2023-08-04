import java.util.Scanner;

public class CovertHour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    System.out.println("enter the time to convert to hrs");
	    int minutes= scan.nextInt();
	      double res=convertToHours(minutes);
	      System.out.printf("%.2f",res);
	      
	}
	public static double convertToHours(int minutes)
	{
		return minutes/60.0;
	}
}
