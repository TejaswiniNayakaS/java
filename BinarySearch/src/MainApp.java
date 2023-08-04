import java.util.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       System.out.println("enter the length");
        int n=scan.nextInt();
        int arr[]= new int[n];
        System.out.println("enter the contents");
        for(int i=0;i<=arr.length-1;i++)
        {
        	arr[i]=scan.nextInt();
        }
        System.out.println("enter the key to search");
        int value = scan.nextInt();
        BinarySearch s1= new BinarySearch();
        s1.search(value,arr);
        
       
	}

}
