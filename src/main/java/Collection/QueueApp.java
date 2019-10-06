package Collection;

import shapesPackage.Point;
import shapesPackage.UncomparablePoint;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue<Point> points = new PriorityQueue<>();

        Point point1 = new Point(1, 2);
        Point point2 = new Point(5, 100);
        Point point3 = new Point(7, 9);

        points.add(point1);
        points.add(point2);
        points.add(point3);
        System.out.println(points);

        while (!points.isEmpty()) {
            System.out.println(points.remove());
            System.out.println(points);
        }




    }

}
