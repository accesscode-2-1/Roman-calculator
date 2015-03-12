package nyc.c4q.ac21.romancalc;

/**
 * Created by sufeiiz & jvidals1 on 3/9/15.
 * Access Code 2.1
 * Team 2
 * Format function
 */

public class TestFormat {
    public static void main(String[] args) {
        // given will be the completed calculation. It's just a test number right now.

        int given = 467;

        // empty string. A letter will be added to it after the value is deducted from the given int.
        String answer = "";

        while (given >= 1000) {
            answer += "M";
            given -= 1000;
        }
        while (given >= 900) {
            answer += "CM";
            given -= 900;
        }
        while (given >= 500) {
            answer += "D";
            given -= 500;
        }
        while (given >= 400) {
            answer += "CD";
            given -= 400;
        }
        while (given >= 100) {
            answer += "C";
            given -= 100;
        }
        System.out.println(answer);
    }
}