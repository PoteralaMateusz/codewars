package zad12;

import java.util.*;


public class DirReduction {

    public static String[] dirReduc(String[] arr) {
        List<String> stringList = new LinkedList<>(Arrays.stream(arr).toList());
        boolean delete = false;
        do {
            delete = false;
            for (int i = 0; i < stringList.size() - 1; i++) {
                if (Objects.equals(stringList.get(i), "NORTH") && Objects.equals(stringList.get(i + 1), "SOUTH") ||
                        Objects.equals(stringList.get(i), "SOUTH") && Objects.equals(stringList.get(i + 1), "NORTH") ||
                        Objects.equals(stringList.get(i), "EAST") && Objects.equals(stringList.get(i + 1), "WEST") ||
                        Objects.equals(stringList.get(i), "WEST") && Objects.equals(stringList.get(i + 1), "EAST")
                ) {
                    stringList.remove(i);
                    stringList.remove(i);
                    delete = true;
                    break;
                }
            }

        } while (delete);

        return stringList.toArray(new String[0]);
    }

    public static void main(String[] args) {

        String[] strings = DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"});

        Arrays.stream(strings).forEach(System.out::println);

    }
}
