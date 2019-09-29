package mainPackage.Package1;

public class App {
    static Person person1 = new Person();
    static mainPackage.Package2.Person person2 = new mainPackage.Package2.Person();

    public static void main(String[] args) {
        System.out.println(person1.age + person1.gender + person1.id + person2.gender);
        person1.getPersonDetails();
    }
}
