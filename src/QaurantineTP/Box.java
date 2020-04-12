package QaurantineTP;

/**
 *
 * keeping box inside box if the size of box is twice as the gien box.
 * ex 1 2 3 
 * then 1 can be kept in 2
 * so we have to take only 2 box
 */

import java.util.Scanner;
public class Box
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter The Length of Array");
		int arraylen = scan.nextInt();

		System.out.println("Enter Array Elements");
		int arr[] = new int[arraylen];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		int count=0;
		for (int i=0;i<arr.length;i++ ) 
		{
			for (int j=i+1;j<arr.length;j++ ) 
			{
					if(arr[i]*2==arr[j] || arr[i]/2==arr[j])
						count++;
			}	
		}
                int tot_box=arr.length-count;
		System.out.println("\n"+tot_box);
	}
}