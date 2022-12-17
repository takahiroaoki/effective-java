package chap2.item4;

public class Utility {
    private Utility() {
        // 明示的にコンストラクタを呼び出せないようにすることで、クラス内やサブクラスからも呼ばれず、インスタンス不可能を保証できる。
        throw new AssertionError();
    }

    public static String doSomething() {
        return "do something";
    }
}
