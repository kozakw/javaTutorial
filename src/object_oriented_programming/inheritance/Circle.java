package object_oriented_programming.inheritance;

public class Circle extends  Point2D{
    double radius;

    public Circle(int x, int y, double radius){
        super(x, y); //the super() need to be the first in constructor and it also calls constructor from Point2D
        this.radius = radius;
    }


    public Circle(){
        // super(10, 10); // I can't have super() and this() in constructor
        this(1,1,5); //it refers to fist constructor


    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateSurface(){
        return Math.pow(this.radius, 2) * Math.PI;
    }
}
