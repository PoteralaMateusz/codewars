package zad28;

public class SumOfSquares {
    public static int nSquaresFor(int n) {
        int number = n;
        int sum = 0;
        int count = 0;
        do {
            if ((Math.sqrt(number) % 1) == 0){
                if ((sum + number) <= n){
                    sum = sum + number;
                    count ++;
                }else{
                    number --;
                }
            }else {
                number--;
            }
        }while (sum != n);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(nSquaresFor(19));
    }
}
