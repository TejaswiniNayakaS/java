package calculatorloop;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
         Calc obj= new Calc();
        while(true) {
        	System.out.println("menu\n enter one 1.+\n 2.-\n3.!");
        	 char ch=scan.next().charAt(0);
        
        switch(ch)
        {
        case '+':
        	obj.add();
        	break;
        case '-':
        	obj.sub();
        	break;
        	
        case '!':
        	 return ;
             
        }
        }
	}

}
