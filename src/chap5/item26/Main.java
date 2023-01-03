package chap5.item26;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings, Integer.valueOf(422));
        System.out.println(strings.get(0));
    }

    private static void unsafeAdd(List list, Object o) {
        // コンパイルではエラーが出ず、実行して初めてエラーが出る。
        list.add(o);
    }

    private static void safeAdd(List<String> list, String o) {
        // 要素の型も指定することで、コンパイル時（もしくはIDEの警告で）気づくことができる。
        list.add(o);
    }
}
