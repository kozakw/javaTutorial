package object_oriented_programming;

public class PointMain {
    public static void main(String[] args){

        /*Point pointA = new Point(1, 2);  //defining point A using point instance
        Point pointB = new Point(3, 4);  //defining point B using point instance

        double distance = pointA.getDistanceBetweenPoints(pointA.x, pointA.y, pointB.x, pointB.y);
        //assigning calculated result to distance variable

        System.out.println("Distance between points A and B is: " + distance);
        //presenting result on screen*/

        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(0, 0);
        Point p4 = new Point(1, 1);
//        p1.displayCoordinates();
//        p2.displayCoordinates();
//        System.out.println(p1.getCoordinates());
//        String result = p2.getCoordinates();
//        System.out.println(result);
        double p1ToP2 = p1.calculateDistance(p2);
        double p1ToP4 = p1.calculateDistance(p4);
        double p2ToP3 = p2.calculateDistance(p3);
        System.out.println(p1ToP2);
        System.out.println(p1ToP4);
        System.out.println(p2ToP3);

    }
}
