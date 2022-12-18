package chap2.item8;

public class Main {
    public static void main(String[] args) {
        // クライアント側に不適切な使われ方をされる可能性が出てしまう

        //// 適切な使われ方
        try (Room myRoom = new Room(7)) {
            System.out.println("Correct use followed by 'Cleaning room'");
        }

        //// 不適切な使われ方
        new Room(7);
        System.out.println("Incorrect use");
    }
}
