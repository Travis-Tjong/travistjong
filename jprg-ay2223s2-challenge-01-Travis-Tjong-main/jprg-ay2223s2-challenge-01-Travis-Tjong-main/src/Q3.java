/**
 *
 * @author PUT YOUR NAME HERE
 */
import java.util.Scanner;
public class Q3 
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("This programme will generate a rectangle with $");
        System.out.print("Enter height");
        int height = input.nextInt();
        System.out.print("Enter width");
        int width = input.nextInt();
         String str = "";
         String rectangle="";
        for(int i=0;i<width;i++){
           str += "$";
           
        }
        for(int i=0;i<height;i++){
          rectangle +=str + "\n";
           
        }
        System.out.println(rectangle);
    }
}
