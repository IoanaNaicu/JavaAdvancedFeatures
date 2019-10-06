package Collection;

import shapesPackage.Point;

import java.util.HashSet;
import java.util.Set;

public class HashSetApp {
    public static void main(String[] args) {
        Set<Point> points = new HashSet<>();

        Point point1 = new Point(1, 2);
        Point point2 = new Point(5, 100);
        Point point3 = new Point(7, 9);
        Point point4 = new Point(7,9);

        points.add(point1);
        points.add(point2);
        System.out.println(points.add(point3));
        System.out.println(points.add(point4));
        System.out.println(points);
    }
}
