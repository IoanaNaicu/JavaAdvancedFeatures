package numberPackage;

public class App {
    public static void main(String[] args) {
        TestNumber testNumber = new TestNumber();
//        double[] numbers = {1,2,3,4};
//
//        double result = testNumber.sum(numbers);
//        System.out.println(result);

        Number[] numbers = new Number[]{new Integer(3), new Double(3.12),
                new Long(4l)};
        System.out.println(testNumber.sum(numbers));
        String string = "1,1,1,1";
        System.out.println(testNumber.sum(string, ","));


        for (int i = 0; i < 4; i++) {
            Counter counter = new Counter();
            System.out.println(counter.getValue());
        }

    }


}
