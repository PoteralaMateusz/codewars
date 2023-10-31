package escaping_matrix;

import org.junit.Test;

public class MatrixTest {
    @Test(expected = Neo.class)
    public void test() {
        Matrix.enter();
    }
}
