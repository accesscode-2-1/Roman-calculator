package nyc.c4q.madelyntav;

/**
 * Created by c4q-madelyntavarez on 3/10/15.
 */
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number");
        int max= input.nextInt();

        for (int i = 0; i <= max; i++) {
            System.out.print(i+" ");

        }
    }
}

