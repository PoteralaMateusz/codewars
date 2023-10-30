package twiceLinear;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleLinear {

    public static int dblLinear(int n) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        int number = 0;
        do {
            sequence.add(2 * sequence.get(number) + 1);
            sequence.add(3 * sequence.get(number) + 1);
            number++;
            if (number % 4 == 0 && number < 50) {
                sequence = sequence.stream()
                        .sorted()
                        .distinct().collect(Collectors.toList());
            }

            if (number % 40 == 0 && number >= 50) {
                sequence = sequence.stream()
                        .sorted()
                        .distinct().collect(Collectors.toList());
            }
        } while (number <= n + 1);

        return sequence.get(n);
    }


    public static void main(String[] args) {

        System.out.println(dblLinear(14250));

    }
}
