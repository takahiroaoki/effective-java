package chap2.item3;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        // singleton1とsingleton2は同じインスタンスを指している。
        System.out.println(singleton1.equals(singleton2));

        // singleton1からinfoを設定しても、当然singleton2から読み込める。
        singleton1.setInfo("test");
        System.out.println(singleton2.getInfo());
    }
}
