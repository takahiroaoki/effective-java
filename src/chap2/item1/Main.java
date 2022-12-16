package chap2.item1;

class Main {
    public static void main(String[] args) {
        Person person1 = Person.withNameAge("Alice", 26);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());

        Person person2 = Person.withNameAgeGender("Bob", 33, Person.Gender.MAN);
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println(person2.getGender());
    }
}