/**
 *
 * Sorting Arrays in Descending Array
 */
package QaurantineTP;
import java.util.Scanner;
public class SortingArrayDes 
{
    public static void main(String args[])
    {
        int temp;
        Scanner s =  new Scanner(System.in);
        System.out.println("Enter Lenght Of Array");
        int arrlen=s.nextInt();
        int arr[]=new int[arrlen];
        System.out.println("Enter Array Elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        
        System.out.println("Arrays Before Sorting");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
         
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("\n Arrays After Sorting");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
