package shapesPackage;

public interface Colorable {
   public final  int DEFAULT_COLOR_CODE = 0;

    static void describeBehaviour(){
        System.out.println("this is colorable");
    }

    default void printFillColor(){
       // System.out.println("Default colo code is" + DEFAULT_COLOR_CODE);
        System.out.println(String.format("Default colo code is %d.",DEFAULT_COLOR_CODE)); //SA NU CONCATENAM STRINGURI CA MAI SUS
    }

    abstract void render();

    public static class GenericColor{

    }
}
