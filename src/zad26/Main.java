package zad26;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        user.rank = 8;
        System.out.println(user.rank);
        System.out.println(user.progress);
        user.incProgress(8);
        System.out.println(user.progress);
        user.incProgress(7);
        System.out.println(user.progress);
        System.out.println(user.rank);
    }
}
