/**
 *
 * @author SHIVam M. Laidwar
 */
package Arrays;
import java.util.Scanner;
public class MultiD 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row Size");
        int rows = sc.nextInt();
        System.out.println("Enter Coloumn Size");
        int coloumn = sc.nextInt();
        
        int a[][]=new int[rows][coloumn];
        int b[][]=new int[rows][coloumn];
        
        System.out.println("Enter Array A");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter Array B");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Addition Of 2 Arrays is :");
        int c[][]=new int[rows][coloumn];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<coloumn;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
