package shapesPackage;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Circle circle1 = new Circle(4);

        System.out.println(Point.origin);

       Colorable.describeBehaviour();
       circle1.render();

       Shape circle2 = new Circle(7);
       circle2.area();

        Shape circle3 = new Circle(7);
        ((Circle)circle3).getRadius();

        Shape.Color color = new Shape.Color(34,187, 2);
        System.out.println(color.toString());

        Shape.InnerPoint innerPoint = circle1.new InnerPoint(1,2,3);

    }
}
