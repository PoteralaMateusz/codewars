package zad27x;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {

    public static List<String> singlePermutations(String s) {
        Set<String> result = new HashSet<>();
        char[] chars = s.toCharArray();
        if (s.length() == 1) {
            result.add(s);
            return result.stream().toList();
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                char[] charsToRandom = chars;
                if (i != j) {
                    char first = charsToRandom[i];
                    char second = charsToRandom[j];
                    charsToRandom[i] = second;
                    charsToRandom[j] = first;
                    StringBuilder s1 = new StringBuilder();
                    for (char c : charsToRandom) {
                        s1.append(c);
                    }
                    result.add(s1.toString());
                }
            }
        }
        return result.stream().toList();
    }

    public static void main(String[] args) {

        singlePermutations("abcd").forEach(System.out::println);
    }
}
