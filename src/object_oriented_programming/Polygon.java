package object_oriented_programming;

public class Polygon {
    public Point[] points;

    public Polygon(Point[] points){
        this.points = points;
    }

    public Point[] getPoints(){
        //return  this.points;
        Point[] copyPoints = new Point[this.points.length];
        for(int i = 0;i< points.length;i++){
            copyPoints[i] = new Point(this.points[i].x, this.points[i].y);
        }
        return copyPoints;
    }
}
