package zad30;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {

    public static List<Point> closestPair(List<Point> points) {
        BigDecimal distance = distance(points.get(0),points.get(1));
        List<Point> result = new ArrayList<>();
        result.add(points.get(0));
        result.add(points.get(1));
        int size = points.size();

        for (int i = 1; i < size - 1; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                BigDecimal distanceTemp = distance(points.get(i), points.get(j));
                if (distance.compareTo(distanceTemp) > 0){
                    distance = distanceTemp;
                    result = Arrays.asList(points.get(i),points.get(j));
                }
            }
        }
        return result;
    }

    public static BigDecimal distance(Point point_1, Point point_2){
        return BigDecimal.valueOf(( (point_2.x - point_1.x) * (point_2.x - point_1.x) )  + ((point_2.y - point_1.y) * (point_2.y - point_1.y) ));
    }


    public static void main(String[] args) {
        List<Point> points = Arrays.asList(
                new Point(2, 2), //A
                new Point(2, 8), //B
                new Point(5, 5), //C
                new Point(6, 3), //D
                new Point(6, 7), //E
                new Point(7, 4), //F
                new Point(7, 9)  //G
        );

        List<Point> result = Kata.closestPair(points);

        System.out.println(result);
    }
}
