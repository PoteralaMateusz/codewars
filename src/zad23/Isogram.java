package zad23;

import java.util.HashMap;
import java.util.Map;

public class Isogram {

    public static boolean  isIsogram(String str) {
        Map<Character,Integer> charCount = new HashMap<>();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            charCount.putIfAbsent(str.charAt(i) , 0);
            charCount.put(str.charAt(i),charCount.get(str.charAt(i)) + 1);
        }

        for(Map.Entry<Character,Integer> entry : charCount.entrySet()){
            if (entry.getValue() > 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(Isogram.isIsogram("Dermatoglyphics"));
        System.out.println(Isogram.isIsogram("isogram"));
        System.out.println(Isogram.isIsogram("moose"));

    }
}
