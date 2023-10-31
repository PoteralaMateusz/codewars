package large_factorials;

import java.math.BigInteger;

public class Kata {
    public static String Factorial(int n) {
        BigInteger number = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            number = number.multiply(BigInteger.valueOf(i));
        }
        return number.toString();
    }

    public static void main(String[] args) {

        System.out.println(Kata.Factorial(15));
        System.out.println(Kata.Factorial(5));
    }
}
