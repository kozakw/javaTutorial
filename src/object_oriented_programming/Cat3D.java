package object_oriented_programming;
//TOPIC: Access levels
public class Cat3D {
    private String name;
    private int age;
    private boolean happy;
    public double weight;

    //constructor is in default package level
    public Cat3D(String name, int age, boolean happy){
        this.name = name;
        this.age = age;
        this.happy = happy;
    }

    public void readsBook(Book b){
        System.out.println("Cat " + this.name + " is reading a book by " + b.getAuthor());
    }

    public Cat3D(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Changing the value of name from: " + this.name + " to " + name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }
}
