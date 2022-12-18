package chap3.item13;

public class Main {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.push("An object in stack1");
        try {
            Stack stack2 = stack1.clone();
            System.out.println(stack2.pop());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // StackクラスのCloneメソッドで、elementsフィールドも含めてcloneしないと、stack2のelementsと同じインスタンスを参照することになってしまう。
        System.out.println(stack1.pop());
    }
}
