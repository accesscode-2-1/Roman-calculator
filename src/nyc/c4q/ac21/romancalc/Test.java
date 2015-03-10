package nyc.c4q.ac21.romancalc;

/**
 * Created by sufeiiz & jvidals1 on 3/9/15.
 * Access Code 2.1
 * Team 2
 * Format function
 */

public class Test {
    public static void main(String[] args) {
        int given = 950;
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
        while (given >= 90) {
            answer += "XC";
            given -= 90;
        }
        while (given >= 50) {
            answer += "L";
            given -= 50;
        }
        while (given >= 40) {
            answer += "XL";
            given -= 40;
        }
        while (given >= 10) {
            answer += "X";
            given -= 10;
        }
        while (given >= 9) {
            answer += "IX";
            given -= 9;
        }
        while (given >= 5) {
            answer += "V";
            given -= 5;
        }
        while (given >= 4) {
            answer += "IV";
            given -= 4;
        }
        while (given >= 1) {
            answer += "I";
            given -= 1;
        }

        System.out.println(answer);
    }
}

