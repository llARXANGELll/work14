package work14;

import java.util.List;

public class Person {

    private String name;
    private int age;
    private List<String> prof;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getProf() {
        return prof;
    }

    public Person(String name, int age, List<String> prof) {
        this.name = name;
        this.age = age;
        this.prof = prof;
    }
}
