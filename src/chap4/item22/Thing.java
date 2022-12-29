package chap4.item22;

class Thing implements ThingInterface {
    public Thing() {
    }

    @Override
    public void use() {
        System.out.println("This thing is used.");
    }
}
