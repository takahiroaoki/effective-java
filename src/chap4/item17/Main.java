package chap4.item17;

class Main {
    public static void main(String[] args) {
        Complex c1 = Complex.valueOf(5, 4);
        Complex c2 = Complex.valueOf(6, 3.5);
        System.out.println(c1.equals(c2));
        System.out.println(c1.plus(c2));
        System.out.println(c1.minus(c2));
        System.out.println(c1.times(c2));
        System.out.println(c1.dividedBy(c2));
    }
}
