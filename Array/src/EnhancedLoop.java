import java.util.Scanner;
import java.util.*;
public class EnhancedLoop {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("enter the size");
    int arr[]=new int[scan.nextInt()];
    System.out.println("enter the contents");
    for(int i=0;i<=arr.length-1;i++)
    {
    	arr[i]=scan.nextInt();
    }
    System.out.println("the array elements are");
    for(int i:arr)
    {
    	System.out.print(i+5+" ");
    }
}
}
