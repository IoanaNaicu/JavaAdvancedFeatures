package shapesPackage;

import static Collection.Utils.getThisDistanceToOrigin;

public class Point implements Comparable {

    public static Point origin = new Point(0, 0);

    private double xPos;
    private double yPos;

    public double getxPos() {
        return xPos;
    }

    public double getyPos() {
        return yPos;
    }

    public Point(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }

    @Override
    public String toString() {
        return "(" + xPos + "," + yPos + ")";
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Point)) {
            return false;
        }
        if (other == this) {
            return true;
        }

        Point otherPoint = (Point) other;
        return Double.compare(this.xPos, otherPoint.getxPos()) == 0 &&
                Double.compare(this.yPos, otherPoint.getyPos()) == 0;

    }

    @Override
    public int compareTo(Object other) {
        double thisDistanceToOrigin = getThisDistanceToOrigin(this.xPos, this.yPos);
        Point otherPoint = (Point) other;
        double otherDistanceToOrigin = getThisDistanceToOrigin(otherPoint.getxPos(), otherPoint.getyPos());
        return Double.compare(thisDistanceToOrigin, otherDistanceToOrigin);

    }

//    private static double getThisDistanceToOrigin(double x, double y) {
//        return Math.pow(x, 2) + Math.pow(y, 2);
//    }
}
