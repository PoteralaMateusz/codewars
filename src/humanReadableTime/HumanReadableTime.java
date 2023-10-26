package humanReadableTime;

public class HumanReadableTime {

    public static String makeReadable(int seconds) {
        int sec = seconds % 60;
        int min = seconds / 60;
        int h = min / 60;
        min = min % 60;
        StringBuilder result = new StringBuilder();
        formatPadded(result,h);
        result.append(":");
        formatPadded(result,min);
        result.append(":");
        formatPadded(result,sec);
        return result.toString();
    }

    private static void formatPadded(StringBuilder string, int number){
        if (number / 10 == 0){
            string.append("0" + number);
        }else {
            string.append(number);
        }
    }

    public static void main(String[] args) {

        System.out.println(makeReadable(0));
        System.out.println(makeReadable(5));
        System.out.println(makeReadable(86399));


    }
}
