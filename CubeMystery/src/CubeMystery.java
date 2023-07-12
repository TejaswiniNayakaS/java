import java.util.*;
public class CubeMystery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int num= scan.nextInt();
		cubeNumber(num);
		System.out.println(cubeNumber(3));
	}

	public static int cubeNumber(int num)
	{
		
		 return num*num*num;
	}
}
