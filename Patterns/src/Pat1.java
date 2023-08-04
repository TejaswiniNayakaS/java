
public class Pat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=5;i++)
{
	if(i==1)
	{
		for(int p=1;p<=5;p++)
		System.out.print("*");
	}
	
	else if(i==5)
	{
		System.out.print("*");
	}
	else{
		for(int j=1;j<=2;j++)
		{
			System.out.print("*");
			for(int h=3;h>=i-1;h--) {
				System.out.print(" ");
			}
		}
		
	}
	System.out.println();
}

	}

}
