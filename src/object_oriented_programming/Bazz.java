package object_oriented_programming;

public class Bazz {
    int a;
    double b;
    String c;
    char d;
    boolean e;

    int age = 18;
    String name = "Random name";

    Bazz(){}

    Bazz(int age, String name){
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args){
        Bazz myBazz = new Bazz();
        Bazz secondBazz = new Bazz(27, "Other name");
        System.out.println(myBazz.age + " " + myBazz.name); //18 Random name
        System.out.println(secondBazz.age + " " + secondBazz.name); //27 Other name
//        System.out.println(myBazz.a); //0 - default value for all the integer data-types
//        System.out.println(myBazz.b); //0.0 - default value for float as well
//        System.out.println(myBazz.c); //null // this is a reference, NOT an object, and I'm going to have
//        //null values for any kind of reference (Cat, Dog, Point etc)
//        System.out.println(myBazz.d); //\u0000
//        System.out.println(myBazz.e); //false
    }
}
