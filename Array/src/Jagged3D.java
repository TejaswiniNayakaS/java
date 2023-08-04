
import java.util.Scanner;

public class Jagged3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter the 1d");
	
		
		Scanner scan=new Scanner(System.in);
		int arr[][][]= new int[scan.nextInt()][][];
	
		for(int i=0;i<=arr.length-1;i++)
			
		{
			System.out.println("enter the2d");
	    arr[i]= new int[scan.nextInt()][];
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.print("enter the 3d of"+i+"of class"+j);
	    arr[i][j]= new int[scan.nextInt()];
		}
		}
		

	    
		System.out.println("enter the content");
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 
		 for(int j=0;j<=arr[i].length-1;j++)
		 {
			 for(int k=0;k<=arr[i][j].length-1;k++)
			 {
				 System.out.println("enter the school of"+i+"of class"+j+"of student"+k);
				 arr[i][j][k]=scan.nextInt();
			 }
		 }
	 }
	 System.out.println("the array is");
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 System.out.println();
		 
		 for(int j=0;j<=arr[i].length-1;j++)
		 {
			 System.out.println();
			 for(int k=0;k<=arr[i][j].length-1;k++)
			 {
		
				   System.out.print(arr[i][j][k]);
			 }
		 }
	 }
		
		
	}

}
