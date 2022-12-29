class DataHolder {
    // 配列はfinalにしても可変になってしまうので、privateとし、取得用のメソッドをfinalで用意することで隠蔽できる。
    private static final Thing[] THINGS_ARRAY = {
            Thing.newInstance(0),
            Thing.newInstance(1),
            Thing.newInstance(2)
    };

    public static final Thing[] getThingsArray() {
        return THINGS_ARRAY;
    }
}
