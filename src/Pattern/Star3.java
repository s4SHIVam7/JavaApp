/**
 Print The Pattern Like That
**********
 *********
  ********
   *******
    ******
     *****
      ****
       ***
        **
         * 
 Print The Pattern Like That 
 */
package Pattern;
public class Star3 
{
    public static void main(String args[])
    {
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=10-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}