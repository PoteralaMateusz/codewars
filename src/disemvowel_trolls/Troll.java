package disemvowel_trolls;

public class Troll {

    public static String disemvowel(String str) {
        StringBuffer noTroll = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i)+ "").matches("[aeiouAEIOU]")){
                noTroll.append(str.charAt(i));
            }
        }
        return noTroll.toString();
    }


    public static void main(String[] args) {

        System.out.println(Troll.disemvowel("This website is for losers LOL!"));
    }
}
