package object_oriented_programming.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Circle c1 = new Circle(2,2, 6);

        Circle c2 = new Circle();

        c1.getRadius();
        c1.setRadius(10);
        c1.getX();

        System.out.println(c1.getX());

        Cylinder cyl1 = new Cylinder( 2,3,5,4);
        System.out.println(cyl1.calculateVolume());
    }

}
