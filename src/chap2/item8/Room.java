package chap2.item8;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable {
    private static final Cleaner cleaner = Cleaner.create();

    // クリーニングを必要とする資源。Roomを参照してはいけない
    private static class State implements Runnable {
        int numJunkPiles;// 部屋のごみの数

        private State(int numJunkPiles) {
            this.numJunkPiles = numJunkPiles;
        }

        @Override
        public void run() {
            System.out.println("Cleaning room");
            numJunkPiles = 0;
        }
    }

    private final State state;
    private final Cleaner.Cleanable cleanable;

    public Room(int numJunkPiles) {
        state = new State(numJunkPiles);
        cleanable = cleaner.register(this, state);
    }

    @Override
    public void close() {
        cleanable.clean();
    }
}
