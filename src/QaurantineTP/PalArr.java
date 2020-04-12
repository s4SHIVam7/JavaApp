package QaurantineTP;
import java.util.*;
public class PalArr 
{
    static void pal(int arr[],int n)
    {
        int flag = 0;
        for(int i=0;i<=n/2&&n!=0;i++)
        {
            if(arr[i]!=arr[n-i-1])
            {
                flag=1;
//                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Not Palindrome");
        }
        if(flag==0)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("vshvd");
        }
            
    }
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Test Cases");
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.println("Enter Size Of Number");
            int s=sc.nextInt();
            int arr[]=new int[s];
            int n=arr.length;
            System.out.println("Enter Elements");
            for(int j=0;j<n;j++)
            {
                arr[i]=sc.nextInt();
            }
            pal(arr,n);
        }
    }
}
