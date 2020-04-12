/**
 *
 * @author SHIVam M. Laidwar
 */
package Pattern;
import java.util.Scanner;
public class NumPyramid 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num");
        int s=sc.nextInt();
        int num=1;
        for(int i=1;i<=s;i++)
        {
            for(int j=1;j<=s-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
            
        }
    }
}
