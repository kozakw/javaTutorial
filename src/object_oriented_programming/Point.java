package object_oriented_programming;

public class Point {
    /*
    HOMEWORK:
        1. For the class Point - add coordinates as attributes (x, y)
        2. Build one constructor (and only one) that provides values to those attributes.
        3. Create another class (PointMain.java) - and create two instances of the class with the following
        coordinates: (1, 2); (3, 4)
        4. Add a behaviour that will allow to calculate the distance between two points.
        (you can use Math.sqrt() for square root)
     */
/*    int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    double getDistanceBetweenPoints(int ax, int ay, int bx, int by){
        return  Math.sqrt(Math.pow((bx - ax),2) + Math.pow((by - ay),2));
    }*/
    public double x;
    public double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    void displayCoordinates(){
        System.out.println("X: " + this.x + "; Y: " + this.y);
    }

    String getCoordinates(){
        String coordinates = "X: " + this.x + "; Y: " + this.y;
        return coordinates;
    }

    double calculateDistance(Point p){
        //this - the instance that is calling the method
        //p - the instance that was passed as a parameter to the method
        double distance;
        //
//        distance = Math.sqrt( (p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y) );
        distance = Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
        return distance;
    }
}


