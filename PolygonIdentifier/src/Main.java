import java.util.*;
public class Main

{

public static void identifyPolygon(int sides)
{
  switch(sides)
  {
  
  case 3:System.out.println("triangle");
         break;
  case 4:System.out.println("quadrilateral");
         break;
  case 5:System.out.println("pentagon");
         break;
  case 6:System.out.println("hexagon");
	  break;
	  default:System.out.println("polygon");
  }


}

public static void main(String[] args)
{
 Scanner scan = new Scanner(System.in);
 System.out.println("enter the sides");
 int n= scan.nextInt();
 identifyPolygon(n);
 
}

}

