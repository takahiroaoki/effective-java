package chap4.item16;

class Main {
    public static void main(String[] args) {
        Point point = new Point(1.0, 2.0);
        point.setX(2.0).setY(1.0);
        System.out.println(point.getX());
        System.out.println(point.getY());
    }
}
