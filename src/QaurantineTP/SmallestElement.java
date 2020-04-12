/**
 *
 * @author SHIVam M. Laidwar
 */
package QaurantineTP;
public class SmallestElement 
{
    public static void main(String args[])
    {  
        int a[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Array Is ");
        
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        
        int SmallNum=a[0];
        
        for(int i=0;i<a.length;i++)
        {
            if(SmallNum>a[i])
            {
                SmallNum=a[i];
            }
        }
        System.out.println("\nSmallest Element Is "+SmallNum);
    }
}
