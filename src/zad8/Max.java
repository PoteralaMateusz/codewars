package zad8;

public class Max {
    public static int sequence(int[] arr) {
        int result = 0;
        int maxResult = 0;

        for (int i = 0; i < arr.length; i++) {
            result = 0;
            for (int j = i; j < arr.length; j++) {
                result = result + arr[j];
                if (result > maxResult){
                    maxResult = result;
                }
            }
        }
        return maxResult;
    }

    public static void main(String[] args) {

        System.out.println(Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
// should be 6: {4, -1, 2, 1}
    }
}
