import java.util.*;
public class SquareNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(squareNumber(num));
		scan.close();
	}
		public static int squareNumber(int num)
		{
			return num*num;
		}
		
		
	}


