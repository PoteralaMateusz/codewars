package zad1;

public class test {

    public static void main(String[] args) {
        int[] test = Kata.arrayDiff(new int [] {1,2}, new int[] {1});

        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }
}
