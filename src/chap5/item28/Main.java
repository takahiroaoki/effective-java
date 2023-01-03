package chap5.item28;

import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        // 配列は"共変"といって、SubがSuperのサブクラスなら、Sub[]がSuper[]のサブクラスになってしまう。
        // 一方Listは"不変"であり、List<Sub>はList<Super>のサブクラスとはならない。
        // 安全のために配列よりListを使う。

        // この場合ArrayStoreExceptionは実行時まで分からない。
        Object[] objectArray = new Long[1];
        objectArray[0] = "I don't fit in.";

        // こちらはコンパイルでエラーが起きる。
        // List<Object> objectList = new ArrayList<Long>();
        // objectList.add("I dont't fit in.");

    }
}
