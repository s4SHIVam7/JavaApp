/**
 *
 * @author SHIVam M. Laidwar
 */
package Sorting;
public class Bubble_Sort 
{
    public static void main(String[] shivam)
    {
        int a[]={2,1,8,-3,6,4,22};
        System.out.println("Arrays Before Sorting");
                for(int item:a)
        {
            System.out.print(item+" ");
        }
        int n=a.length;
        
        for(int i=0;i<n-1;i++)
        {
            boolean sorted = true; // With Optimization
//            for(int j=0;j<n-1;j++) //Without Optimization
//            for(int j=0;j<n-1-i;j++) // With Optimization
                  for(int j=0;j<n-i-1;j++) // With Optimization
            {
                if(a[j+1]<a[j])
                {
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    sorted = false; // With Optimization
                }
            }
            if(sorted) break; // With Optimization
        }
        System.out.println("\n Arrays After Bubble Sorting");
        for(int item:a)
        {
            System.out.print(item+" ");
        }
    }
}
