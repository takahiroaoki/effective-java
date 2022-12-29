class Thing {
    private int property;

    private Thing(int property) {
        this.property = property;
    }

    public static Thing newInstance(int property) {
        return new Thing(property);
    }

    public int getProperty() {
        return property;
    }
}
