package QaurantineTP;

//package javaapplication1;
import java.util.Scanner;
public class IndexToGetElement 
{
    public static void main(String[] args)
    {
        int a[] = {1,2,5,7,6};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Index Position");
        int index = s.nextInt();
        
        for(int i=0;i<=a.length;i++)
        {
            if (index==i)
            {
                System.out.println(a[i]);
                break;
            }
            else if(index>a.length)
            {
                System.out.println(" Out of Size");
                break;
            }
            else if(index<a.length)
            {
                System.out.println(" Not Present");
                break;
            }
        }
    }
}
