package zad2;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int vertical = 0;
        int horizon = 0;

        if (walk.length == 10) {
            for (char c : walk) {
                switch (c) {
                    case 'n' -> vertical++;
                    case 's' -> vertical--;
                    case 'e' -> horizon++;
                    case 'w' -> horizon--;
                }
            }
            System.out.println(vertical);
            System.out.println(horizon);
            return vertical == 0 && horizon == 0;
        } else {
            return false;
        }
    }

    public class TenMinWalkStream {
        public static boolean isValid(char[] walk) {
            String s = new String(walk);
            return s.chars().filter(p -> p == 'n').count() == s.chars().filter(p -> p == 's').count()
                    &&
                    s.chars().filter(p -> p == 'e').count() == s.chars().filter(p -> p == 'w').count()
                    &&
                    s.chars().count() == 10;
        }
    }

    public static void main(String[] args) {

        System.out.println(TenMinWalkStream.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        System.out.println(TenMinWalkStream.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        System.out.println(TenMinWalkStream.isValid(new char[]{'w'}));
        System.out.println(TenMinWalkStream.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }
}
