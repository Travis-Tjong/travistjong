/**
 *
 * @author PUT YOUR NAME HERE
 */
import java.util.Scanner;
public class Q2 
{
    public static void main(String[] args) {
        int num = 1;
        int total = 0;
        int berries;
        do{
           Scanner input = new Scanner(System.in);
           System.out.print("Gatherer "+ num + ",please enter amount of berries you found.(Enter -1 to end)");
           berries = input.nextInt();
           total += berries;
           num++;
        }while(berries!=-1);
        total += 1;
        int each = total/(num-2);
        int remain = total%(num-2);
                
        System.out.println("Number of gatherers: "+(num-2)+"\nTotal berries found: "+total+"\nEach gatherer gets: "+each + "\nRemaining berries not distributed: "+remain);
    }
}
