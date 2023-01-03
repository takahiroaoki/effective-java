package chap5.item30;

import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Set<String> s1 = Set.of("Alice", "Bob", "Carle");
        Set<String> s2 = Set.of("Larry", "Moe", "Curly");
        Set<Integer> s3 = Set.of(1, 2, 3, 4);
        // genericのおかげで、コンパイル段階でエラーが出る。
        // union(s1, s3);
        System.out.println(union(s1, s2));
    }

    private static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }
}
