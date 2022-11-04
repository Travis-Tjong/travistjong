/**
 *
 * @author PUT YOUR NAME HERE
 */
import java.util.Scanner;
public class Q4 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Player 1 one enter you score");
        double p1 = input.nextDouble();
        System.out.print("Player 2 one enter you score");
        double p2 = input.nextDouble();
        if(p1>p2){
            System.out.println("Player 1 wins");
        }else{
            System.out.println("Player 2 wins");
        }
    }
}
