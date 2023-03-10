package chap2.item1;

public class Person {
    public static enum Gender {
        MAN, WOMAN, OTHER
    }

    private String name;
    private int age;
    private Gender gender;

    private Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static Person newInstance(String name, int age) {
        return new Person(name, age, null);
    }

    public static Person newInstance(String name, int age, Gender gender) {
        return new Person(name, age, gender);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Gender getGender() {
        return this.gender;
    }
}
