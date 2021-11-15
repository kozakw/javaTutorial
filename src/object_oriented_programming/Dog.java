package object_oriented_programming;

public class Dog {
    //attributes
    int age;
    double weight;
    String furColor;
    /*
    Dog(){
        //this is the default format of any default constructor
    }
     */
    //constructors
    Dog(int age, double weight, String furColor){
        this.age = age; //assigning the value from the age parameter to the age attribute
        //of the instance that is being created
        this.weight = weight;
        this.furColor = furColor;
    }

    Dog(){}

    //behaviours
    void barks(){
        System.out.println("Woof Woof! I am " + this.age + " years old.");
    }

    double getFinalWeight(double foodQuantity){
        return this.weight + foodQuantity;
    }
}