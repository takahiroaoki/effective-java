package chap5.item32;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<Object> list2 = new ArrayList<>();
        list1.add("test0");
        list2.add("test1");

        System.out.println(flatten(list1, list2));
    }

    @SafeVarargs
    private static <T> List<T> flatten(List<? extends T>... lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists) {
            result.addAll(list);
        }
        return result;
    }
}
