import java.util.Scanner;

public class HeightCovertorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
	 
	       HeightConvertor obj=new HeightConvertor();
	       System.out.println("enter the height  convert inches to feet");
		    double height= scan.nextDouble();
	        double res=obj.convertInchesToFeet(height);
	      System.out.printf("%.2f",res);
	      
	}

}
