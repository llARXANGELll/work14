package work14;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private int age;
    ArrayList<String> prof;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getProf() {
        return prof;
    }

    public Person(String name, int age, ArrayList<String> prof) {
        this.name = name;
        this.age = age;
        this.prof = prof;
    }
}
