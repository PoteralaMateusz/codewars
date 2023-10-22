package zad31;

public class Square {

    public static boolean isSquare(int n) {
        if (n < 0){
            return false;
        }
        double result = Math.sqrt(n);
        result = result - (int) result;
        if (result == 0.0d){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Square.isSquare(-1));
        System.out.println(Square.isSquare(0));
        System.out.println(Square.isSquare(3));
        System.out.println(Square.isSquare(4));
        System.out.println(Square.isSquare(25));
        System.out.println(Square.isSquare(26));

    }
}
