package Collection;

import shapesPackage.UncomparablePoint;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue2App {
    public static void main(String[] args) {
        Comparator<UncomparablePoint> comparator = new Comparator<UncomparablePoint>() {
            @Override
            public int compare(UncomparablePoint p1, UncomparablePoint p2) {
                double p1DistanceToOrigin = Utils.getThisDistanceToOrigin(p1.getX(), p1.getY());
                double p2DistanceToOrigin = Utils.getThisDistanceToOrigin(p2.getX(), p2.getY());
                return Double.compare(p1DistanceToOrigin, p2DistanceToOrigin);
            }
        };
        Queue<UncomparablePoint> uncomparablePoints = new PriorityQueue<>(comparator);

        UncomparablePoint point1 = new UncomparablePoint(1, 2);
        UncomparablePoint point2 = new UncomparablePoint(5, 100);
        UncomparablePoint point3 = new UncomparablePoint(7, 9);

        uncomparablePoints.add(point1);
        uncomparablePoints.add(point2);
        uncomparablePoints.add(point3);
        System.out.println(uncomparablePoints);

        while (!uncomparablePoints.isEmpty()) {
            System.out.println(uncomparablePoints.remove());
            System.out.println(uncomparablePoints);
        }
    }

}
