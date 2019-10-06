package numberPackage;

public class Counter {
    private static int counter = 0;

    public Counter(){
        counter++;
    }

    public int getValue() {
        return counter;
    }
}
