package kodnest.com.level3;

public class Linear {

     static int search(int arr[],int key)
     {
    	 for(int i=0;i<=arr.length-1;i++)
         {
      	   if(key==arr[i])
      	   {
      		   System.out.println("key found");
      		    return i;
      		   		
      	   }
         }
    	
    	 return -1;
     }


}
