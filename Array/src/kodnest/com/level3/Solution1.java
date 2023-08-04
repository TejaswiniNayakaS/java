package kodnest.com.level3;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the length");
		Scanner scan = new Scanner(System.in);
        int arr1[]= new int[scan.nextInt()];
        System.out.println("enter the arrayfirst element");
        for(int i=0;i<=arr1.length-1;i++)
        {
     	  arr1[i]= scan.nextInt();
        }
        System.out.println("The content of arrayfirst");
        for(int i:arr1)
        {
        	System.out.println(i+" ");
        }
        System.out.println("enter the length of2");
        int arr2[]= new int[scan.nextInt()];
        System.out.println("enter the arraysecond element");
        for(int i=0;i<=arr2.length-1;i++)
        {
     	  arr2[i]= scan.nextInt();
        }
        System.out.println("The content of arraysecond");
        for(int i:arr2)
        {
        	System.out.println(i+" ");
        }
        int n= arr1.length+ arr2.length;
        int arr3[]= new int[n];
       for(int i=0;i<=arr1.length-1;i++)
       {
    	   arr3[i]=arr1[i];
       }
       for(int i=0;i<=arr2.length-1;i++)
       {
    	   int j=arr1.length+i;
    	   arr3[j]=arr2[i];
    	   
       }
       System.out.println("The content of merged array");
       for(int i:arr3)
       {
       	System.out.println(i+" ");
       }
       
       
	}

}
