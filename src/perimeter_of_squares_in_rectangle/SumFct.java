package perimeter_of_squares_in_rectangle;

import java.math.BigInteger;

public class SumFct {

    public static BigInteger perimeter(BigInteger n) {

        if (n.toString().equals("1")){
            return new BigInteger("4");
        }
        if (n.toString().equals("2")){
            return new BigInteger("8");
        }
        BigInteger fiboSum = new BigInteger("2");
        BigInteger firstNumber = new BigInteger("1");
        BigInteger secondNumber = new BigInteger("1");
        for (int i = 3; i <= n.intValue() + 1; i++) {
            BigInteger nextNumber = firstNumber.add(secondNumber);
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            fiboSum = fiboSum.add(nextNumber);
        }

        return fiboSum.multiply(new BigInteger("4"));
    }

    public static void main(String[] args) {

        System.out.println(perimeter(new BigInteger("5")));

    }
}
