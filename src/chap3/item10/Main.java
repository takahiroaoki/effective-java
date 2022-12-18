package chap3.item10;

public class Main {
    public static void main(String[] args) {
        // Objectクラスに実装されているequalsメソッドは、"同じインスタンスであるか"を判定するメソッド。
        // StringやInteger, Listなどの標準クラスを除き、原則overrideしないこと。（副作用が出て、システムが破綻する可能性もある）
        Object object1 = new Object();
        Object object2 = new Object();
        System.out.println(object1.equals(object2));
    }
}
