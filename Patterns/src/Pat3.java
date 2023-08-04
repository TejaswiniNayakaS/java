
public class Pat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++)
		{
			if(i==3)
			{
			     System.out.print("*");
					
				}
			else
				for(int p=1;p<=2;p++)
				{
					System.out.print("*");
					for(int s=2;s>=i;s--)
					{
						System.out.print(" ");
					}
				}
			System.out.println();
			}
		}
	}


