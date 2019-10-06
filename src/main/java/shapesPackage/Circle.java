package shapesPackage;

import jdk.nashorn.internal.runtime.ECMAException;
import vehiclePackage.Car;

public class Circle extends Shape implements Colorable {


    private int radius;
    private Point center;

    public Circle(int radius) {
        super(5);
        System.out.println("constructor Circle");
        this.radius = radius;
        this.center = new Point(0, 0);
    }

    Circle(int radius, int colorCode, Point center) {
        super(colorCode);
        this.radius = radius;
        this.center = center;
    }


    //    public Circle(){
//
//    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Double area() throws ShapeException {
        return Math.PI * this.radius * this.radius;
    }

    public void fillColor() {
        System.out.println(this.colorCode);
    }


    @Override
    public void render() {
        System.out.println("circle is rendered");
    }
}
