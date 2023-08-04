package kodnest.com.level3;

import java.util.Scanner;

public class Solution5 {

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
        System.out.println("enter the two index to swap");
        int m= scan.nextInt();
        int n=scan.nextInt();
        System.out.println("The content of array");
        for(int i:arr1)
        {
        	System.out.println(i+" ");
        }
        Array a1= new Array();
        int res[]=a1.Swap(arr1,m,n);
        System.out.println("SwappedArray is");
        for(int p:res)
        {
        	System.out.print(p+" ");
        }
        
	}

}
