package oops.association.composition;

public class Book {

    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void showBook() {
        System.out.println("Book: " + title);
    }
}
