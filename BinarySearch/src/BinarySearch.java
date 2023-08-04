
public class BinarySearch {
public void search(int key,int arr[])
{
	int low=0;
	int high=arr.length-1;
	
	while(low<=high) {
		int mid= (high+low)/2;
	if(key==arr[mid])
		
	{
		System.out.println("key found ");
		return;
	}
	else if(key>=arr[mid])
	{
		low=mid+1;
	}
	else {
		high=mid-1;
	}
	}
	System.out.println("key not found");
		
	}
}
