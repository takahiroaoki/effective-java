package chap4.item25;

class Main {
    public static void main(String[] args) {
        System.out.println(Utensil.NAME + Dessert.NAME);
    }

    // Javaは1ファイルに2つのトップレベルのクラスを定義できるが、コンパイルの順序に依存して予測不可能な動きになる。
    // あるクラスを1ファイルにまとめたくなった場合はネストしてstaticなメンバークラスにすることを検討する。

    private static class Utensil {
        static final String NAME = "pan";
    }

    private static class Dessert {
        static final String NAME = "cake";
    }
}
