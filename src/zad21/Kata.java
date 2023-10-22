package zad21;

public class Kata {

    public static long nextBiggerNumber(long n)
    {
        String number = String.valueOf(n);
        StringBuffer nextNumber = new StringBuffer();
        boolean exist = false;
        for (int i = number.length() - 1; i > 0 ; i--) {
            if (!exist) {
                if (number.charAt(i) > number.charAt(i - 1)) {
                    nextNumber.append(number.charAt(i - 1));
                    nextNumber.append(number.charAt(i));
                    i--;
                    exist = true;
                } else {
                    nextNumber.append(number.charAt(i));
                }
            }else {
                if (i == 1){
                    i++;
                }

                for (int j = i; j >= 0; j--) {
                    nextNumber.append(number.charAt(j));
                }
                break;
            }
        }

        return exist ? Long.valueOf(nextNumber.reverse().toString()) : -1;
    }

    public static void main(String[] args) {

        System.out.println(Kata.nextBiggerNumber(12));
        System.out.println(Kata.nextBiggerNumber(513));
        System.out.println(Kata.nextBiggerNumber(414));
        System.out.println(Kata.nextBiggerNumber(111));
        System.out.println(Kata.nextBiggerNumber(2017));

    }
}
