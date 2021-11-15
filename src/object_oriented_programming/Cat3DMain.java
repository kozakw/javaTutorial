package object_oriented_programming;

public class Cat3DMain {
    public static void main(String[] args){
        Cat3D c1 = new Cat3D("Mi", 2, true);
        System.out.println(c1.getName());
        System.out.println(c1.getAge());
        System.out.println(c1.isHappy());
        c1.setName("False flag");
        c1.setAge(99);
        c1.setHappy(false);
        System.out.println(c1.getName());
        System.out.println(c1.getAge());
        System.out.println(c1.isHappy());
    }
}