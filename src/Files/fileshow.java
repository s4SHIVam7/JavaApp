/**
 *
 * @author SHIVam M. Laidwar
 */
package Files;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class fileshow 
{
    public static void main(String[] args) throws IOException
    {
//        String str;
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("Enter File Path To List The Files And Folders");
        String fp = sc.nextLine();
        
        File file = new File(fp);
        
        String[] fileList =file.list();
        for(String str:fileList)
        {
            System.err.println(str);
        }
//        do{
         System.out.println("Enter File Path To open");
        String fp2 = sc.nextLine();
        
        File file2 = new File(fp2);
        
        Desktop desktop = Desktop.getDesktop();
        desktop.open(file2);
//        System.out.println("Do you Want To Continue");
//        flushall();
//        str=sc.nextLine();
//        } 
//        while(str=="y");
    }
}
