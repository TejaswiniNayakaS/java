import java.util.*;

public class ThreeDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][][]= new int[3][][];
	    arr[0]= new int[3][];
	    arr[1]= new int[2][];
	    arr[2]= new int[4][];
	    
	    arr[0][0]= new int[3];
	    arr[0][1]= new int[4];
	    arr[0][2]= new int[2];
	    
		arr[1][0]= new int[4];
		arr[1][1]= new int[3];
		
		arr[2][0]= new int[2];
		arr[2][1]= new int[3];
		arr[2][2]= new int[1];
		arr[2][3]= new int[2];
		Scanner scan=new Scanner(System.in);
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
