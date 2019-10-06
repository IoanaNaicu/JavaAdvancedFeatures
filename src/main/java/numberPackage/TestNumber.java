package numberPackage;

public class TestNumber {

//    public double sum(Number[] numbers){
//        double sum = 0;
//        for (Number number: numbers ) {
//            sum +=numbers[i].doubleValue();
//        }
//        return sum;
//    }

    public Double sum (Number[] numbers){
        double sum = 0;
        for (int i = 0; i<numbers.length;i++){
//            sum+=Double.parseDouble(numbers[i].toString());
            sum+=numbers[i].doubleValue();

        }
        return sum;
    }

    public  static Integer sum(String numbers, String separator){
        String[] values = numbers.split(separator);
        int sum = 0;
        for (String s: values){
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}
