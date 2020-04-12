/**
 *
 * @author SHIVam
 */
package QaurantineTP;
public class power_of_two 
{
    static void pow_of_two(int n)
    {
        if(n!=0)
        {
            if(n%2==0)
            {
                System.out.println("Yes");
                n=n/2;
            }
            else
            {
                System.out.println("NO");
            }
        }
        else
        {
            System.out.println("NO");
        }
    }
    public static void main(String[] shivam)
    {
        pow_of_two(3);
        pow_of_two(0);
        pow_of_two(1);
        pow_of_two(2);
    }
}
