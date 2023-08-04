package kodnest.com.level4;

public class IntegerArray {
	    int[] Array(int arr1[])
	     {int i=0;
            while(i<=arr1.length-1)
            {
            	if(arr1[i]<0)
            	{
            		arr1[i]=0;
            	}
            	i++;
            }
            return arr1;
            	
	     }

}
