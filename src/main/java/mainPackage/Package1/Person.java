package mainPackage.Package1;

public class Person {
    private String name;
    int age;
    protected String id;
    public String gender;

    public Person(String name, int age, String id, String gender) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void getPersonDetails(){
        System.out.println(this.name + this.gender + this.id + this.age);
    }

    public Person(){

    }
}
