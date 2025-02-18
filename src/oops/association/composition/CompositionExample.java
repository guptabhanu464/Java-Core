package oops.association.composition;

public class CompositionExample {

    public static void main(String[] args) {

        // Strong Relationship
        // Part-of Relationship
        // If parent gets destroyed , child will also be destroyed
        // Library Creates book object internally
        Library library = new Library("City Library");
        Book book = new Book("GOOD WILL HUNTING");
        book.showBook(); // I have created this , but this book object is not part of Library
        library.showLibrary();
    }
}
