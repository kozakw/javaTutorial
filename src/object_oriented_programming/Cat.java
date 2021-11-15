package object_oriented_programming;

public class Cat {
    //attributes - any instance can have a different value for this attributes
    String name;
    double weight;
    int age;
    //static variables - they are NO LONGER attributes, because they are declared with the
    //static modifier
    static int counter;
    static String furColor;
    //counter and furColor are class variables - their value depends on the class and shared amongst
    //all instances

    Cat(String name, double weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        Cat.counter += 1;
    }

    void eats(){
        System.out.println("The " + this.name + " cat is eating. Getting fat.");
    }

    static void meows(String food){
        System.out.println("MEOW MEOW! I want to eat!" + food);
//        this.age = 10; // age is an attribute and I can not refer to it from a static context
    }
}