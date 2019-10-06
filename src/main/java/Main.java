public class Main {
    public static void main(String[] args) {
        String myString = "101,34,56";
        myString.split(",");

        String[] numbers = myString.split(",");

        int sum = 0;
        for (String string: numbers ) {
            sum = sum + Integer.parseInt(string);

        }
        System.out.println(sum);


    }
}
