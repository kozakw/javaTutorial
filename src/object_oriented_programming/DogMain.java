
package object_oriented_programming;

public class DogMain {
    public static void main(String[] args){
        Dog bolt = new Dog(); //calling the constructor of Dog class -> the constructor is building an instance
        //and the reference to that instance is bolt
        Dog aslan = new Dog(5, 6.7, "white");
        Dog d3 = bolt; //currently bolt and d3 are references to the same object
        //so I have two object and three references

        bolt.age = 3;
        bolt.weight = 32.5;
        bolt.furColor = "golden";
        System.out.println(bolt.age + " " + bolt.weight + " " + bolt.furColor);
        System.out.println(d3.age + " " + d3.weight + " " + d3.furColor);
        System.out.println(aslan.age + " " + aslan.weight + " " + aslan.furColor);

        bolt.barks();
        aslan.barks();
        double newWeight = bolt.getFinalWeight(1.2);
        System.out.println(newWeight);
    }
}