package romanNumerals;


public class RomanNumerals {

    static int number;
    static StringBuilder romanNumeral;
    public static String toRoman(int n) {
        romanNumeral = new StringBuilder();
        number = n;


        countToRoman("MC", 1100);
        countToRoman("M", 1000);
        countToRoman("CM", 900);
        countToRoman("DC", 600);
        countToRoman("D", 500);
        countToRoman("CD", 400);
        countToRoman("CX", 110);
        countToRoman("C", 100);
        countToRoman("XC", 90);
        countToRoman("LX", 60);
        countToRoman("L", 50);
        countToRoman("XL", 40);
        countToRoman("X", 10);
        countToRoman("IX", 9);
        countToRoman("V", 5);
        countToRoman("IV", 4);

        romanNumeral.append("I".repeat(Math.max(0, number)));

        return romanNumeral.toString();
    }

    private static void countToRoman(String romanNumber, int value) {
        if (romanNumber.equals("MC")) {
            if (number % value < 100 && number / value == 1) {
                romanNumeral.append(romanNumber.repeat(Math.max(0, number / value)));
                number = number % value;
            }
            return;
        }
        if (romanNumber.equals("DC")) {
            if (number % value < 100 && number / value == 1) {
                romanNumeral.append(romanNumber.repeat(Math.max(0, number / value)));
                number = number % value;
            }
            return;
        }
        if (romanNumber.equals("CX")) {
            if (number % value < 10 && number / value == 1) {
                romanNumeral.append(romanNumber.repeat(Math.max(0, number / value)));
                number = number % value;
            }
            return;
        }
        if (romanNumber.equals("LX")) {
            if (number % value < 10 && number / value == 1) {
                romanNumeral.append(romanNumber.repeat(Math.max(0, number / value)));
                number = number % value;
            }
            return;
        }
        if (number / value > 0 ) {
            romanNumeral.append(romanNumber.repeat(Math.max(0, number / value)));
            number = number % value;
        }
    }

    public static int fromRoman(String romanNumeral) {
        number = 0;
        romanNumeral = countFromRoman(romanNumeral,"CM",900);
        romanNumeral = countFromRoman(romanNumeral,"CD",400);
        romanNumeral = countFromRoman(romanNumeral,"XC",90);
        romanNumeral = countFromRoman(romanNumeral,"XL",40);
        romanNumeral = countFromRoman(romanNumeral,"IX",9);
        romanNumeral = countFromRoman(romanNumeral,"IV",4);
        romanNumeral = countFromRoman(romanNumeral,"M",1000);
        romanNumeral = countFromRoman(romanNumeral,"D",500);
        romanNumeral = countFromRoman(romanNumeral,"C",100);
        romanNumeral = countFromRoman(romanNumeral,"L",50);
        romanNumeral = countFromRoman(romanNumeral,"X",10);
        romanNumeral = countFromRoman(romanNumeral,"V",5);
        romanNumeral = countFromRoman(romanNumeral,"I",1);

        return number;
    }

    private static String countFromRoman(String romanNumeral, String symbol, int value) {
        int count = 0;
        while (romanNumeral.contains(symbol)) {
            romanNumeral = romanNumeral.replaceFirst(symbol, "");
            count++;
        }
        number += value * count;
        return romanNumeral;
    }


    public static void main(String[] args) {
        System.out.println(toRoman(1512));

    }
}
