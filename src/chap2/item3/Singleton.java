package chap2.item3;

public enum Singleton {
    INSTANCE;

    private String info;

    public String getInfo() {
        return this.info;
    }

    public Singleton setInfo(String info) {
        this.info = info;
        return this;
    }
}
