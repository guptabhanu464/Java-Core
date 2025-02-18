package oops.association.composition;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private List<Book> books; // Composition: Library owns Books

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
        addBooks(); // Creating books inside Library
    }

    // Private Method Creating Books Inside Library
    private void addBooks() {
        books.add(new Book("Java Programming"));
        books.add(new Book("Data Structures"));
    }

    public void showLibrary() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.showBook();
        }
    }
}
