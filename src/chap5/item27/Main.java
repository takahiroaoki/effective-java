package chap5.item27;

import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        // HashSetに型パラメータを示さないと無検査警告が出る。
        // new HashSet<String>()と明示するか、new HashSet<>()とダイヤモンド演算子を書くだけでも型推論を行ってくれる。
        Set<String> stringSet = new HashSet();
        stringSet.add("test");
        System.out.println(stringSet);
    }
}
