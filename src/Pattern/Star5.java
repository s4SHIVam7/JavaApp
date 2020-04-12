/**
 Print This Pattern
*
* * 
*   * 
*     * 
* * * * * 
Print Like This 
 * @author SHIVam M. Laidwar
 */
package Pattern;
import java.util.Scanner;
public class Star5 
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Num");
        int n=sc.nextInt();
        System.out.println("*");
        
        for(int i=2;i<=n-1;i++)
        {
            System.out.print("* ");
            for(int j=1;j<=i-2;j++)
            {
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }
        
        for(int i=1;i<=n;i++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }            
}
