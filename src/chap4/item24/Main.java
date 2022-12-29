package chap4.item24;

class Main {
    public static void main(String[] args) {
        Group group = Group.newInstance();
        group.add(Member.of("Alice", 26)).add(Member.of("Bob", 25));
        System.out.println(group.selectOneMemberAtRandom());
    }
}
