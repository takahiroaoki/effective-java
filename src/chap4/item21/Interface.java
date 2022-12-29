package chap4.item21;

interface Interface {
    // defaultメソッド機能により、interfaceにメソッドを後から追加することが可能になったが、副作用が無いように注意が必要。
    public default void use() {
        System.out.println("This method is implemented as default.");
    }
}
