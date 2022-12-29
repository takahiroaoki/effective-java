package chap4.item23;

class Main {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(1.0, 2.0);
        Figure circle = new Circle(3.0);
        System.out.println(rectangle.area());
        System.out.println(circle.area());
    }
}
