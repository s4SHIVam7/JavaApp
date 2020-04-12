package QaurantineTP;
import java.util.Scanner;
public class ArrayFromConsole 
{
   public static void main(String args[])
   {
       int c=0;
       Scanner s =  new Scanner(System.in);
       System.out.println(" Enter Length Of The Arry ");
       int arraylength=s.nextInt();
       
       System.out.println("Enter The Array Element : ");
       int arr[]=new int[arraylength];
       
       for(int i=0;i<arr.length;i++)
       {
           arr[i] = s.nextInt();
       }
       
       for(int i=0;i<arr.length;i++)
       {
           
           c=arr[i]/arraylength;
           System.out.print(arr[i]+" ");
       }
                  System.out.println("\n"+c);

   }
            
}