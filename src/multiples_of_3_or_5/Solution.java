package multiples_of_3_or_5;

import java.util.stream.IntStream;

public class Solution {
    public static int solution(int number) {
        return IntStream.range(1,number)
                .filter(x -> x % 3 == 0  || x % 5 == 0 )
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
