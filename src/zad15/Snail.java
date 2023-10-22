package zad15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Snail {

    public static int[] snail(int[][] array) {
        List<Integer> result = new ArrayList<>();
        int startIndex = 0;

        do {

            for (int i = startIndex; i < array.length - startIndex; i++) {
                result.add(array[startIndex][i]);
            }
            for (int i = startIndex + 1; i < array.length; i++) {
                result.add(array[i][array.length - 1 - startIndex] );
            }
            for (int i = array.length - startIndex - 2; i >= 0; i--) {
                result.add(array[array.length - 1 - startIndex][i]);
            }
            for (int i = array.length - startIndex - 2; i > 0; i--) {
                result.add(array[i][startIndex]);
            }
        startIndex ++;
        }
        while (startIndex !=2);

        result.add(array[startIndex][startIndex]);

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }

    public static void main(String[] args) {

        int[][] array
                = {{1, 2, 3 ,4},
                   {4, 5, 6 ,7},
                   {7, 8, 9, 10},
                   {1, 2, 3, 4}};

        Arrays.stream(snail(array)).forEach(value -> System.out.print(value + " "));
    }

}
