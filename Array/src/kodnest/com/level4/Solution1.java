package kodnest.com.level4;

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
        SumArray s1= new SumArray();
         int res[]=s1.Sum(arr1,arr2);
         System.out.println("The addition of array in third array");
         for(int p:res)
         {
         	System.out.print(p+" ");
         }
        
	}

}
