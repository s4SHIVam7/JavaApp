/**
 *
 * Sorting Given Array in Ascending Order
 */
package QaurantineTP;
public class SortingArray 
{
   public static void main(String args[])
   {
       int a[]={10,2,40,60,30};
       int temp=0;
       System.out.println(" Arrays Before i.e. Unorder ");
       for(int i=0;i<a.length;i++)
       {
           System.out.print(" "+a[i]);
       }
       for(int i=0;i<a.length;i++)
       {
           for(int j=i;j<a.length;j++)
           {
               if(a[i]>a[j])
               {
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
           }
       }
       System.out.println("\n Arrays After i.e order ");
       for(int k=0;k<a.length;k++)
       {
           System.out.print(" "+a[k]);
       }
   }
}
