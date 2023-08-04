
import java.util.Scanner;
public class ArraySearch {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
        System.out.println("enter the key to search");
        int key =scan.nextInt();
        Search s1= new Search();
       boolean res= s1.isPresent(key);
       if(res==true)
       {
    	   System.out.println("key found");
       }
       else
    	   System.out.println("key not found");
        

	}

}
