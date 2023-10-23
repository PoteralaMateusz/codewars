package zad33;

public class Kata {
    public static String sumString(String a, String b){
        StringBuilder result = new StringBuilder();
        StringBuilder bigNumberReverse;
        StringBuilder smallerNumberReverse;

        if (a.length() >= b.length()){
            bigNumberReverse = new StringBuilder(a).reverse();
            smallerNumberReverse = new StringBuilder(b).reverse();
        }else {
            smallerNumberReverse = new StringBuilder(a).reverse();
            bigNumberReverse = new StringBuilder(b).reverse();
        }

        int memory = 0;
        int sum ;
        for (int i = 0; i <= bigNumberReverse.length() - 1; i++) {
            if (i <= smallerNumberReverse.length() - 1){
                sum = Character.getNumericValue(smallerNumberReverse.charAt(i)) + Character.getNumericValue(bigNumberReverse.charAt(i)) + memory;
            }else {
                sum = Character.getNumericValue(bigNumberReverse.charAt(i)) + memory;
            }
            memory = sum / 10;
            result.append(sum % 10);
        }
        if (memory > 0){
            result.append(memory);
        }
        result.reverse();
        Kata.clearFirstZeros(result);
        return result.toString();
    }

    private static void clearFirstZeros(StringBuilder number){
        int firstNumber = Character.getNumericValue(number.charAt(0));
        while (firstNumber == 0){
                number.deleteCharAt(0);
                firstNumber = Character.getNumericValue(number.charAt(0));
        }
    }

    public static void main(String[] args) {
        System.out.println(Kata.sumString("0000000000000000103","00000000000000000000000000000008567"));

    }
}
