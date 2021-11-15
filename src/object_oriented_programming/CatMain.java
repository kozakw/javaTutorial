package object_oriented_programming;

public class CatMain {
    public static void main(String[] args){
        Cat.furColor = "black";
        Cat.meows("whiskas");
        Cat c1 = new Cat("Leia", 5.5, 5);
        Cat c2 = new Cat("Sheba", 5.4, 4);
        Cat c3 = new Cat("Sheba", 5.4, 4);
        Cat c4 = new Cat("Sheba", 5.4, 4);
        c1.weight = 5.7;
        c2.age = 5;

        //the recommended approach to refer to static variables
        Cat.furColor = "grey";
//        Cat.counter = 2;

        System.out.println(c1.furColor); //NOT RECOMMENDED - it can create confusion
        System.out.println(c2.counter); //SAME HERE

        c2.furColor = "brown";//NOT RECOMMENDED - here just for teaching purposes; INSTEAD - use Cat.furColor
        System.out.println(Cat.furColor); //brown
        System.out.println(Cat.counter);// 4
        c1.eats();
        c2.eats();
        Cat.meows("kittycat"); //RECOMMENDED FORMAT FOR CALLING A STATIC METHOD
//        c2.meows("whiskas"); //DON'T CALL STATIC METHODS IN THIS FORMAT - IT CAN CREATE CONFUSION
    }
}
