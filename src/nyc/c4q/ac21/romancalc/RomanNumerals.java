package nyc.c4q.ac21.romancalc;
import java.util.Scanner;
/**
 * Code to convert to and from Roman numerals.
 */
public class RomanNumerals {
    /**
     * Formats a number in Roman numerals.
     * @param value
     *   The value to format.
     * @return
     *   The value in Roman numerals.
     */
    static String format(int value) {
        // TODO: Group 1: Write this function!
        return "???";
    }

    /**
     * Parses a number in Roman numerals.
     * @param number
     *   The number to parse.
     * @return
     *   The value, or -1 if the number isn't in Roman numerals.
     */
    public static int parse(String number) {
        // TODO: Group 2: Write this function!

        // TODO: Add Roman Numeral to variable "number"!
        number = ;
        int currNumber;
        int previousNumber;
        char previousLetter;
        char currentLetter;
        int sum = 0;
        int totalSum = 0;
        String update = " " + number;

        //char test = given.charAt(given.length()-1);
        //System.out.println(test);

        for (int i = update.length() - 1; i >=1; i--) {
            currentLetter = update.charAt(i);
            previousLetter = update.charAt(i - 1);

            if (currentLetter == 'M') {
                currNumber = 1000;
            }
            else if (currentLetter == 'D') {
                currNumber = 500;
            }
            else if (currentLetter == 'C') {
                currNumber = 100;
            }
            else if (currentLetter == 'L') {
                currNumber = 50;
            }
            else if (currentLetter == 'X') {
                currNumber = 10;
            }
            else if (currentLetter == 'V') {
                currNumber = 5;
            }
            else if (currentLetter == 'I') {
                currNumber = 1;
            }
            else  {
                currNumber = 0;
            }

            if (previousLetter == 'M') {
                previousNumber = 1000;
            }
            else if (previousLetter == 'D') {
                previousNumber = 500;
            }
            else if (previousLetter == 'C') {
                previousNumber = 100;
            }
            else if (previousLetter == 'L') {
                previousNumber = 50;
            }
            else if (previousLetter == 'X') {
                previousNumber = 10;
            }
            else if (previousLetter == 'V') {
                previousNumber = 5;
            }
            else if (previousLetter == 'I') {
                previousNumber = 1;
            }
            else {
                previousNumber = 0;
            }


            if (currNumber > previousNumber) {
                sum = sum + (currNumber - previousNumber);
                i--;
            } else if (currNumber <= previousNumber){
                sum = sum + currNumber;
            }


        }

        System.out.println(sum);


        return -1;
    }

    public static void main(String[] argv) {
        // TODO: Group 3: Write this function!
        // It should test that format() and parse() work correctly.
    }
}
