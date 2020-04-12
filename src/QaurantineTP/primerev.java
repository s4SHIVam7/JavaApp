package QaurantineTP;

public class primerev
{
	public static void main(String[] args) 
	{
		int i;
		int num;
		int count;

		for(num=50;num>=1;num--)
		{
			count=0;
			for(i=2;i<num/2;i++)
			{
				if(num%i==0)
				{
					count++;
					break;
				}
			}
			if(count == 0 && num!=1)
			{
				if(num%10==3 || num%10==7)
				{
					System.out.print(num+" ");
				}
			}
		}

	}
}