/**
 *
 * @author SHIVam M. Laidwar
 */
package QaurantineTP;
public class BiggestElement 
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8,9};
        System.out.println("Array is ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        int BiggestNum=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(BiggestNum<a[i])
            {
                BiggestNum=a[i];
            }
        }
        System.out.println("\nBiggest Element Is "+BiggestNum);
    }
}
