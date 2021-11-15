package object_oriented_programming;
//This class is immutable
public class Book {
    private String author;
    private int numberOfPages;

    public Book(String author, int numberOfPages) {
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        Book b1 = new Book("", 1);
        return numberOfPages;
    }
}
