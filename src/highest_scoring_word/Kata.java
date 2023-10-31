package highest_scoring_word;

public class Kata {

    public static String high(String s) {
        String[] strings = s.split(" ");
        String highestString = "";
        int highestScore = 0;
        for (String string : strings){
            int score = 0;
            for (int i = 0; i < string.length(); i++) {
                score += string.charAt(i) - 96;
            }
            if (score > highestScore){
                highestScore = score;
                highestString = string;
            }
        }
        return highestString;
    }

    public static void main(String[] args) {

        System.out.println(Kata.high("man i need a taxi up to ubud"));

    }
}
