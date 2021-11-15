package object_oriented_programming.inheritance;

public class Cylinder extends Circle {
    /*
    Implement a Cylinder class. Add the proper attributes and methods that will allow us to
    calculate the volume of a cylinder.
     */
    double height;

    public Cylinder (int x, int y, double radius, double height){
        super(x, y, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume(){
        return calculateSurface() * height;
    }
}
