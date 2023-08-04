import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
    System.out.println("enter the size");
    int arr[]=new int[scan.nextInt()];
    System.out.println("enter the contents");
    for(int i=0;i<arr.length-1;i++)
    {
    	arr[i]=scan.nextInt();
    }
    System.out.println("the array elements are");
    for(int i=0;i<arr.length-1;i++)
    {
    	System.out.println(arr[i]);
    }

	}

}
