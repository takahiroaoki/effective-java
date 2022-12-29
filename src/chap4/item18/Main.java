package chap4.item18;

import java.util.Set;

class Main {
    public static void main(String[] args) {
        InstrumentedSet<String> stringSet = new InstrumentedSet<>(Set.of("test1", "test2", "test3"));
        System.out.println(stringSet);
    }
}
