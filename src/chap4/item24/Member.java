package chap4.item24;

class Member {
    private String name;
    private int age;

    private Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Member of(String name, int age) {
        return new Member(name, age);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name: ").append(name).append(", age: ").append(age);
        return sb.toString();
    }
}
