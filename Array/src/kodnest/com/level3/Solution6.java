package kodnest.com.level3;

import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the length");
		Scanner scan = new Scanner(System.in);
        int arr1[]= new int[scan.nextInt()];
        System.out.println("enter the array element");
        for(int i=0;i<=arr1.length-1;i++)
        {
     	  arr1[i]= scan.nextInt();
        }
        
        System.out.println("The content of array");
        for(int i:arr1)
        {
        	System.out.println(i+" ");
        }
        System.out.println("Array Reversed");
        for(int i=arr1.length-1;i>=0;i--)
        {
     	  System.out.print(arr1[i]+" ");
        }
        
	}

}
