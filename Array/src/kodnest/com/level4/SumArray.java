package kodnest.com.level4;

public class SumArray {
           int[] Sum(int arr1[],int arr2[])
          {
        	  int n= arr1.length;
        	  int arr3[]= new int[n];
        	  int i=0;
        	  int sum=0;
        	  while(i<=arr1.length-1)
        	  {
        		  sum=arr1[i]+arr2[i];
        		  arr3[i]=sum;
        		  i++;
        	  }
        	  return arr3;
        	  
        	  
          }
	

}
