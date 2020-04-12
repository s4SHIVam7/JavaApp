/**
 *
 * @author SHIVam M. Laidwar
 */
package varargs;

import java.util.Scanner;

public class varargs 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size");
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        System.out.println("Enter "+n+" Integers");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        sum(arr);
        sum(10);
        sum(10,20);
        sum(10,20,30);
    }

    private static void sum(int...i) 
    {
        int total=0;
        for(int num:i)
        {
            total+=num;
        }
        System.out.println(total);
//        System.err.println(total);
    }
}
