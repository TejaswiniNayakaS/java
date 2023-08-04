package kodnest.com.level3;
import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the length");
		Scanner scan = new Scanner(System.in);
        int arr[]= new int[scan.nextInt()];
        System.out.println("enter the array element");
        for(int i=0;i<=arr.length-1;i++)
        {
     	  arr[i]= scan.nextInt();
        }
        System.out.println("The content of original array");
        for(int i:arr)
        {
        	System.out.println(i+" ");
        }
        
        
        
        int arr2[]= new int[arr.length];
        for(int i=0;i<=arr2.length-1;i++) {
        
     	  arr2[i]= arr[i];
        }
        System.out.println("The content of copied array");
        for(int i:arr2)
        {
        	System.out.println(i+" ");
        }
        
        
        
	}

}
