package kodnest.com.level3;

public class Array {

	int [] Swap(int arr[],int m,int n)
	{
		int help=arr[m];
		arr[m]=arr[n];
		arr[n]=help;
		return arr;
		
	     
	}
}
