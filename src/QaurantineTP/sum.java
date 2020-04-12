/**
 *
 * @author SHIVam M. Laidwar
 */
package QaurantineTP;
import java.util.*;
public class sum {
        public int sum(int x,int y)
        {
            return(x+y);
        }
        public int sum(int x,int y,int z) // overloading - compile time poly
        {
            return(x+y+z);
        }
        public double sum(double x,double y) //  overloading - compile time poly
        {
            return(x+y);
        }
        //Driver Code
        public static void main(String args[])
        {
            sum s=new sum();
            System.out.println(s.sum(10,20)); // run
            System.out.println(s.sum(10,20,30)); // run
            System.out.println(s.sum(1.5,1.5)); //run
            
//            System.out.println(s.sum(10,20,30)); // yes will run
//            System.out.println(s.sum(10,20)); // yes will run
//            System.out.println(s.sum(1.5,1.5)); //yes will run
        }
}
