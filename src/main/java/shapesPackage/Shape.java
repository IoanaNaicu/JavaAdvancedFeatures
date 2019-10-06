package shapesPackage;

import java.io.IOException;

public abstract class Shape {

    protected int colorCode;

    public class InnerPoint {
        private int x;
        private int y;
        private int z;

        public InnerPoint(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    public static class Color extends Colorable.GenericColor {
        private final int red;
        private final int green;
        private final int blue;

        public Color(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;

        }

        @Override
        public String toString() {
            return "Color{" +
                    "red=" + red +
                    ", green=" + green +
                    ", blue=" + blue +
                    '}';
        }
    }

    public static Shape.Color getDescriptiveColor(final Shape.Color color) {
        //local calss Descrip.. that extends Shape.Color class
        class DescriptiveColor extends Shape.Color {
            public DescriptiveColor() {
                super(color.red, color.green, color.blue);

            }

            public String toString() {
                return "you selected a color with following com" + color.red + ", " + color.green + " ," + color.blue;
            }
        }
        return new DescriptiveColor();
    }

    public Shape(int colorCode) {
        System.out.println("constructor Shape");
    }

    public abstract Double area() throws IOException;

    public static class ShapeException extends IOException {
    };




//    public  Double area(){
//        return 0.0;
//    }
}
