package nyc.c4q.madelyntav;

/**
 * Created by c4q-madelyntavarez on 3/10/15.
 */
import java.util.Scanner;
public class Counter2 {
    public static void main(String[] args){
        Scanner scanner= new Scanner (System.in);
        System.out.println("Give me a starting number");
        int start=scanner.nextInt();

        System.out.println("Give me another ending number");
        int end=scanner.nextInt();

        System.out.println("Give me an increment number");
        int inc=scanner.nextInt();

        for (int i=start; i<=end; i= i+inc) {
        System.out.println(i);

        }
    }
}
