package zad5;

import java.util.ArrayList;
import java.util.List;

//class SumDigPower {
//
//    public static List<Long> sumDigPow(long a, long b) {
//        return LongStream.rangeClosed(a, b)
//                .filter(i -> isValid(i))
//                .boxed()
//                .collect(Collectors.toList());
//    }
//
//    private static boolean isValid(long x){
//        String value = Long.toString(x);
//        return IntStream.range(0, value.length())
//                .mapToDouble(i -> Math.pow(Character.getNumericValue(value.charAt(i)), i + 1))
//                .sum() == x;
//    }
//}

public class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> eurekaNumber = new ArrayList<>();
        for (long i = a; i <= b; i++) {
            long number = i;
            long result = 0;
            int pow = 0;
            while (number > 0) {
                pow++;
                number = number / 10;
            }
            number = i;
            do {
                result += Math.pow(number % 10, pow);
                pow--;
                number = number / 10;
            } while (number > 0);
            if (i == result) {
                eurekaNumber.add(i);
            }
        }
        return eurekaNumber;
    }

    public static void main(String[] args) {

        System.out.println(SumDigPower.sumDigPow(1, 150));
    }

}
