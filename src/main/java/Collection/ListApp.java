package Collection;

import shapesPackage.Point;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        Point point1 = new Point(1,2);
        Point point2 = new Point(2,2);
        Point point3 = new Point(3,2);

        points.add(point1);
        points.add(point2);
        points.add(point3);

        System.out.println(points);

        Point test = new Point(1,2);
        System.out.println(points.remove(test));
        System.out.println(points);

        System.out.println(points.remove(new Point(1,2)));
        System.out.println(points);

        System.out.println(points.remove(point1));
        System.out.println(points);

    }
}
