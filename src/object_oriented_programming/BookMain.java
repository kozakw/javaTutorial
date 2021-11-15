package object_oriented_programming;

public class BookMain {
    static Book b1 = new Book("J.K. Rowling", 200);
    public static void main(String[] args) {
//        Book b1 = new Book("J.K. Rowling", 200);
        Book b2 = new Book("George R.R Martin", 1000);

//        b1.author = "New Author"; // can not modify this directly since it's marked as private
        //If I want to change an attribute for one of the books - I can only create a new instance and
        //copy the attributes that I want to keep
        b1 = new Book(b1.getAuthor(), 250);

        //It can be kept transparent to the user that we are creating a new instance "under the hood"
        //We can keep part of the attributes and only change some of them
        b2 = new Book("Other author name", b2.getNumberOfPages());
        System.out.println(b2.getAuthor() + " " + b2.getNumberOfPages());
        System.out.println(b1.getAuthor() + " " + b1.getNumberOfPages());
    }
}
