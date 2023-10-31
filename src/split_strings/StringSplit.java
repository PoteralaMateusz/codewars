package split_strings;

import java.util.ArrayList;
import java.util.List;


public class StringSplit {

//    public static String[] solution(String s) {
//        if(s.length()%2==1) s+="_";
//        int n=s.length()/2;
//
//        String[] sub=new String[n];
//        for(int i=0;i<n;++i)
//            sub[i]=""+s.charAt(i*2)+s.charAt(1+i*2);
//
//        return sub;
//    }
    
    public static String[] solution(String s) {
        char[] charText = s.toCharArray();
        int pairs = s.length() % 2 == 0 ? (s.length() / 2) : ((s.length() / 2) + 1);
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < (pairs * 2) ; i+=2) {
            try {
                resultList.add(String.valueOf(charText[i]).concat(String.valueOf(charText[i+1])));
            } catch (ArrayIndexOutOfBoundsException e) {
                resultList.add(String.valueOf(charText[i]) + "_");
            }
        }
        String[] result = new String[pairs];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;

    }

    public static void main(String[] args) {
        String[] strings = solution("abcdefg");

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
