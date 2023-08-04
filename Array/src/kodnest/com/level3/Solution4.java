package kodnest.com.level3;
import java.util.Scanner;

public class Solution4 {

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
           for(int i=0;i<=arr.length-1;i++)
           {
        	   if(key==arr[i])
        	   {
        		   System.out.println("key found");
        		    return;
        		   		
        	   }
           }
           System.out.println("key not found");
           
           }
        		   
	}


