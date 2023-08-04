package kodnest.com.level3;

import java.util.Scanner;

public class LinearApp {

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
           System.out.println("enter the key to search");
           int key =scan.nextInt();
           
           Linear s1= new Linear();
            int res=s1.search(arr,key);
            if(res>=0)
            {
            	System.out.println("key found");
            }
            else
            {
            	System.out.println("key not found");
            }
           
	}

}
