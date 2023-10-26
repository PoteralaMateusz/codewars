package rgbToHex;

public class RgbToHex {
    public static String rgb(int r, int g, int b) {
        return decToHex(r) + decToHex(g) + decToHex(b);
    }

    private static String decToHex(int decNumber){
        if (decNumber > 255){
            return "FF";
        }
        if (decNumber < 0){
            return "00";
        }
        int number = decNumber;
        StringBuilder result = new StringBuilder();
        do {
            int rest = number % 16;
            if (rest > 9){
                result.append((char) (65 + (rest % 10)));
            }else {
                result.append(rest);
            }
            number = number / 16;
        }while (number > 0);

        if (result.length() == 1){
            result.append("0");
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {

        System.out.println(rgb(0,0,0));
        System.out.println(rgb(1,2,3));
        System.out.println(rgb(255,255,255));
        System.out.println(rgb(254,253,252));
        System.out.println(rgb(-20,275,125));
    }
}
