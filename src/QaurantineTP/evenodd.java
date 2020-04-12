package QaurantineTP;

public class evenodd
{
	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5,6,7,8};
		int even=0;
		int odd=0;

		for (int i=0;i<a.length;i++ ) 
		{
			//System.out.println("The Numbers are odd ");
			if (a[i]%2==0) 

			{
				//System.out.println("The Numbers are even ");
				even=a[i];
				System.out.println("The Numbers are even "+even);			
			}		
			else
			{
				odd=a[i];
				System.out.println("The Numbers are odd "+odd);
			}
		}	
	}
}