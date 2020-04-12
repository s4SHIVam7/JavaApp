/**
 *
 * @author SHIVam M. Laidwar
 */
package QaurantineTP;
import java.util.Scanner;
public class tables 
{
    public static void main(String args[])
    {
        for(int i=1;i<=10;i++)
        {
          for(int j=1;j<=20;j++)
          {
              System.out.print("\t"+j*i+" ");
          }
          System.out.println();
        }
    }
}
