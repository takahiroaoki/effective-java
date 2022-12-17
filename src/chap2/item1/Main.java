package chap2.item1;

class Main {
    public static void main(String[] args) {
        Person person1 = Person.newInstance("Alice", 26);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());

        Person person2 = Person.newInstance("Bob", 33, Person.Gender.MAN);
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
        System.out.println(person2.getGender());
    }
}