import java.util.*;
public class Main {
	public static void identifyCharacter(char ch)

	{
     if(Character.isDigit(ch))
     {
    	 System.out.println("it is digit");
     }
     else if(Character.isLetter(ch)== false)
     {
    	 System.out.println("it is a special char");
     }
     else
     {
    	 switch(Character.toLowerCase(ch)) 
    	 {
    	 case 'a':
    	 case 'e':
    	 case 'i':
    	 case 'o':
    	 case 'u':
    		 if(Character.isLowerCase(ch))

    		 {

    		 System.out.println("Entered Character "+ch+" Is Lower Case Vowel");

    		 }
    		 else
    		 {
    			 System.out.println(" entered character is Uppercase Vowels");
    		 }
    		 break;
    	default:
    		if(Character.isLowerCase(ch))
    		{
    			System.out.println("entered character is Lowercase consonet");
    		}
    		else
    		{
    			System.out.println("entered character is UpperCase consonet");
    		}
    		
    	 }		
    			
    		
    		
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.println("enter the character");
      char n= scan.next().charAt(0);
      identifyCharacter(n);
	}

}
