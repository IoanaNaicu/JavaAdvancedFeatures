package Collection;

import shapesPackage.UncomparablePoint;

import java.util.HashSet;
import java.util.Set;

public class HashSetApUncom {
    public static void main(String[] args) {
        Set<UncomparablePoint> points = new HashSet<>();

        UncomparablePoint point1 = new UncomparablePoint(1, 2);
        UncomparablePoint point2 = new UncomparablePoint(5, 100);
        UncomparablePoint point3 = new UncomparablePoint(7, 9);
        UncomparablePoint point4 = new UncomparablePoint(7,9);

        points.add(point1);
        points.add(point2);
        System.out.println(points.add(point3));
        System.out.println(points.add(point4));
        System.out.println(points);
    }
}
