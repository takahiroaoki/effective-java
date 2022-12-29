package chap4.item19;

class Thing {
    public Thing() {
        dontOverrideThisMethod();
    }

    // constructorで呼び出されるメソッドがoverrideされると破壊的になる可能性があるためfinalとしている。
    public final void dontOverrideThisMethod() {
        System.out.println("Dont't override this method.");
    }
}
