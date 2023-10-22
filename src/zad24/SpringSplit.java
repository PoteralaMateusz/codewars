package zad24;

import java.util.Arrays;

public class SpringSplit {

    public static String[] solution(String s) {
        s = s.replace(" " ,"");
        int length = s.length();
        StringBuilder split = new StringBuilder();
        for (int i = 0; i < (length % 2 == 0 ? length : length - 1); i = i + 2) {
            split.append(s.charAt(i)).append(s.charAt(i + 1)).append(" ");
        }
        if (length % 2 != 0 ){
            split.append(s.charAt(length - 1)).append("_");
        }

        return split.toString().split(" ");
    }

    public static void main(String[] args) {

        Arrays.stream(SpringSplit.solution("abcde")).forEach(System.out::println);
        Arrays.stream(SpringSplit.solution("He    ll   o   [Wo    rld]")).forEach(System.out::println);

    }
}
