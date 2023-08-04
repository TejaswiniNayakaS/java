import java.util.Scanner;

public class Search {
	public boolean isPresent(int target)
	{
		System.out.println("enter the length");
		Scanner scan = new Scanner(System.in);
        int arr[]= new int[scan.nextInt()];
        System.out.println("enter the array element");
        for(int i=0;i<=arr.length-1;i++)
        {
     	  arr[i]= scan.nextInt();
        }
        for(int i=0;i<=arr.length-1;i++)
        {
     	   if(target==arr[i])
     	   {
     		    return true;
     		   		
     	   }
        }
        return false;
        
        }
	}

