package zad13;

import java.util.*;


public class Interval {

    public static int sumIntervalsOLD(int[][] intervals) {

        List<int[]> list = Arrays.stream(intervals)
                .flatMap(a -> Arrays.stream(intervals).map(b -> a[1] > b[0] && a[0] < b[0] ? new int[]{a[0], b[1]} : a))
                .toList();

        List<int[]> sortList = new ArrayList<>();
        int[] prevArray = {0, 0};
        for (int[] array : list) {
            if (array[0] == prevArray[0] && array[1] == prevArray[1]) {

            } else {
                sortList.add(array);
            }
            prevArray = array;
        }

        sortList.forEach(s -> System.out.println(s[0] + " " + s[1]));

        return Arrays.stream(intervals)
                .map(a -> a[1] - a[0])
                .toList()
                .stream()
                .reduce(0, Integer::sum);

    }

    public static int sumIntervals(int[][] intervals) {
        Set<Integer> numbers = new HashSet<>();
        for (int[] interval : intervals) {
            for (int j = interval[0]; j <= interval[1]; j++) {
                numbers.add(j);
            }
        }
        int intervalsCount = 0;
        int prevNumber = numbers.iterator().next();
        for (Integer number : numbers) {
            if (number - prevNumber != 1) {
                intervalsCount++;
            }
            prevNumber = number;
        }
        return numbers.size() - intervalsCount;
    }

    public static void main(String[] args) {


        System.out.println(sumIntervals(new int[][]{{1, 5}, {10, 20}, {1, 6}, {16, 19}, {5, 11}}));
    }
}
