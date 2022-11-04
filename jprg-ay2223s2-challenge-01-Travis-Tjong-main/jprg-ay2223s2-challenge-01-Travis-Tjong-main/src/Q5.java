/**
 *
 * @author PUT YOUR NAME HERE
 */
import java.util.Scanner;
public class Q5 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many colours will you want to store:");
        int num = input.nextInt();
        String [] colors = new String [num];
        for(int i = 0; i<colors.length;i++){
            System.out.print("Enter the colour name");
            String color = input.next();
            colors[i] = color;
        }
        System.out.print("Pick a colour using the array number:");
        int num2 = input.nextInt();
        System.out.println("The colour at #"+num2+"is"+colors[num2]);
    }
}
