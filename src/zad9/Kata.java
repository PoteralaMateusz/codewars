package zad9;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static int[] sortArray(int[] array) {
        int[] result = new int[array.length];
        List<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                oddList.add(array[i]);
            }
        }
        oddList.sort(Integer::compareTo);

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                result[i] = oddList.get(index);
                index++;
            }else{
                result[i] = array[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] result = Kata.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 });

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
