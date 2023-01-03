package chap5.item31;

import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Stack<Object> stack = new Stack<>();

        Set<String> s1 = new HashSet<>();
        s1.add("test1");
        s1.add("test2");

        stack.push("test0");
        stack.pushAll(s1);

        Set<Object> s2 = new HashSet<>();
        stack.popAll(s2);
        System.out.println(s2);
    }
}
