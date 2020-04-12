package QaurantineTP;
import java.util.*;
public class MissingElement
{
    public static void main(String args[])
    {
        int a[]={1,3,4};
        int b[]=new int[a.length];

        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
           System.out.print(i+1 +" ");
        }
            
        System.out.println("\n");
        
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        } 
        
        System.out.println("\n Missing Element Is : ");
        for(int i=1;i<a.length;i++)
        {
            for(int j=i;j<b.length-1;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.print(b[j]);
                }
            }
        }
        
    }
}

