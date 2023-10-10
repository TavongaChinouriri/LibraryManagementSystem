import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }


    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("There is no books in the library");
        } else {
            System.out.println("These are the books in the library");
            for (Book book : books) {
                System.out.println("ID: " + book.getID());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Availability: " + (book.isAvailabilityStatus() ? "Available" : "Borrowed"));
                System.out.println();
            }
        }
    }

    public void borrowBook(int bookID) {
        for (Book book : books) {
            if (book.getID() == bookID) {
                if (book.isAvailabilityStatus()) {
                    book.setAvailabilityStatus(false);
                    System.out.println("You have borrowed book with the ID: " + bookID);
                } else {
                    System.out.println("Book with the ID: " + bookID + " is already borrowed.");
                }
                return;
            }
        }
        System.out.println("There is no book in the library with the ID " + bookID);
    }

    public void returnBook(int bookID) {
        for (Book book : books) {
            if (book.getID() == bookID) {
                if (book.isAvailabilityStatus()) {
                    System.out.println("Book with ID" + bookID + " is already in the Library");
                } else {
                    book.setAvailabilityStatus(true);
                    System.out.println("You have returned book" + bookID + "in the library");
                }
                return;
            }
        }
        System.out.println("Book with ID" + bookID + " does not exist in the library system");
    }

    public class Main {
        public static void main(String[] args) {
            Library library = new Library();

            // Adding books to the library
            Book book1 = new Book(1, "Book 1", "Author 1", "Available");
            library.addBook(book1);

            Book book2 = new Book(2, "Book 2", "Author 2", "Available");
            library.addBook(book2);

            // Displaying all books in the library
            library.displayBooks();

            // Borrowing a book
            library.borrowBook(1);

            // Displaying all books again to see the updated availability status
            library.displayBooks();

            // Returning a book
            library.returnBook(1);

            // Displaying all books again to see the updated availability status
            library.displayBooks();
        }
    }
}


