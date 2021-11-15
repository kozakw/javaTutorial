package object_oriented_programming.inheritance;

public class Point2D {
    private int x; // x,y - are NOT inherited by Circle class because they are private
    private int y; //however they are accesible thorguht getters and setters
    int z; //z is inherited by the Circle class

    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    // public Point2D(){}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
