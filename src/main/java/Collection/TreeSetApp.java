package Collection;

import shapesPackage.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetApp {
    public static void main(String[] args) {
        Set<Point> points = new TreeSet<>();

        Point point1 = new Point(1, 2);
        Point point2 = new Point(5, 100);
        Point point3 = new Point(7, 9);

        points.add(point1);
        points.add(point2);
        points.add(point3);
        System.out.println(points);


        Point point4 = new Point(7,9);
        System.out.println(points);

        System.out.println(points.remove(new Point(7,9)));
        System.out.println(points);

    }
}
