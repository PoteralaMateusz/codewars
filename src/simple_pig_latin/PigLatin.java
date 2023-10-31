package simple_pig_latin;

public class PigLatin {
    public static String pigIt(String str) {
        String[] strings = str.split(" ");
        String newString = "";
        for (int i = 0; i < strings.length; i++) {
            for (int j = 1; j < strings[i].length(); j++) {
                newString += (""+ strings[i].charAt(j));
            }
            if (strings[i].matches ("[a-zA-Z]+\\.?")) {
                if (i != strings.length - 1) {
                    newString += (strings[i].charAt(0) + "ay ");
                } else {
                    newString += (strings[i].charAt(0) + "ay");
                }
            }else{
                newString += strings[i];
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(PigLatin.pigIt("Pig latin is cool !") + "|");
    }
}
