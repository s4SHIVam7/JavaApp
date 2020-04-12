/**
 *
 * Github : s4SHIVam7  
 */
package QaurantineTP;

public class ParaMethod 
{
    public static void main(String SHIVam[])
    {
        add(10);
        add(10,20.5);
        add(10,20,30);
    }

    private static void add(double...i) 
    {
        double total=0;
        for(double num:i)
        {
            total+=num;
        }
        System.out.println(total);
    }
}
