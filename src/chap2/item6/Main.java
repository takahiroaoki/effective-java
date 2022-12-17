package chap2.item6;

public class Main {
    public static void main(String[] args) {
        // 毎回インスタンスを生成する処理
        long start = System.nanoTime();
        slowProcess();
        long end = System.nanoTime();
        System.out.println(end - start);

        // 余計なインスタンスを生成しない処理
        start = System.nanoTime();
        process();
        end = System.nanoTime();
        System.out.println(end - start);
    }

    private static long slowProcess() {
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;// longをLongに毎回自動ボクシングする(その際都度、インスタンスが生成される)
        }
        return sum;
    }

    private static long process() {
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }
}
