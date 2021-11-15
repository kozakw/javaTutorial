package object_oriented_programming;
//TOPIC: Overloading
public class Number {
    public int x;
    public int y;

    public Number(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Number (int x){
        this(x, 0);  //this must be the first line of constructor
    }

    public Number (double y ){ this(5, (int) y); }

    public Number(){
        this(1,1); //this calling constructor with no parameters
    }

    public Number(String x){
        this.x = Integer.parseInt(x);
        //y - will be 0 as it is default value for int
    }

    public double operation(int a, int b){
        return a+b;
    }

    public double operation(double a, double b){
        return a * b;
    }

    void operation(){
        System.out.println("This method can be defined with no parameters");
    }
 /*public String operation(int x, int y){
        return "Hello world";
        //Not a valid case of overloading, since I have the same number, type an order of parameters
        as the first method defined above
        //it's not enough to have different identifiers and the compiler doesn't care about returned type
        //when it comes to overloading
    }*/

    public double operation(int a, double b){
        return a / b;
    }

    public double operation(double a, int b){
        return Math.pow(a,b);
    }

    public int operation(int z){
        return ++z;
    }



}
