package zad30;

public class Point {
    public double x;
    public double y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return String.format("(%f, %f)", x, y);
    }

    @Override
    public int hashCode() {
        return Double.hashCode(x) ^ Double.hashCode(y);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point other = (Point) obj;
            return x == other.x && y == other.y;
        } else {
            return false;
        }
    }
}
