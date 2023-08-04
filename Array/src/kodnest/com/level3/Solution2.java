package kodnest.com.level3;

import java.util.Scanner;

public class Solution2 {

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
        System.out.println("The content of array");
        for(int i:arr)
        {
        	System.out.println(i+" ");
        }
        
        int sum=0;
        for(int i=0;i<=arr.length-1;i++)
        {
        	sum= sum+arr[i];
        	
        }
        System.out.println("sum of array :" + sum);
	}

}
