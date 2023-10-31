package escaping_matrix;

public class Matrix {
    public static void enter() {
        Matrix.escape();
    }
    public static <T extends Throwable> void escape() throws T {
        throw (T) new Neo();
    }
}
