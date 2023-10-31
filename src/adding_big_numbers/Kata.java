package adding_big_numbers;


public class Kata {
    public static String add(String a, String b) {
        int lengthDifference  = Math.abs(a.length() - b.length());
        StringBuilder aBuilder = new StringBuilder(a);
        aBuilder.reverse();
        StringBuilder bBuilder = new StringBuilder(b);
        bBuilder.reverse();
        if (a.length() < b.length()){
            aBuilder.append("0".repeat(lengthDifference));
        }else {
            bBuilder.append("0".repeat(lengthDifference));
        }
        int inMemory = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < aBuilder.length(); i++) {
            int add = inMemory + Character.getNumericValue(aBuilder.charAt(i)) + Character.getNumericValue(bBuilder.charAt(i));
            System.out.println(add);
            if (add >= 10){
                inMemory = 1;
                result.append(String.valueOf(add).charAt(1));
            }else {
                inMemory = 0;
                result.append(add);
            }
        }
        if (inMemory == 1){
            result.append(1);
        }
        while (Character.getNumericValue(result.charAt(result.length() - 1)) == 0){
            result.deleteCharAt(result.length() - 1);
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(add("5199045360329252 ", "012923442340978796614"));
    }
}
