import java.util.ArrayList;
import java.util.List;

class Book {
    private int bookId;
    private String title;
    private boolean available;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.available = true;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrow() {
        if (available) {
            available = false;
            System.out.println("Book \"" + title + "\" has been borrowed.");
        } else {
            System.out.println("Book \"" + title + "\" is not available for borrowing.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book \"" + title + "\" has been returned.");
        } else {
            System.out.println("This book wasn't borrowed.");
        }
    }
}

class Member {
    private int memberId;
    private String name;
    private List<Book> borrowedBooks;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.borrow();
            System.out.println("Book \"" + book.getTitle() + "\" has been borrowed by " + name);
        } else {
            System.out.println("Book \"" + book.getTitle() + "\" is not available for borrowing.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook();
            System.out.println("Book \"" + book.getTitle() + "\" has been returned by " + name);
        } else {
            System.out.println("This book wasn't borrowed by " + name);
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Introduction to Java");
        Book book2 = new Book(2, "Data Structures and Algorithms");
        Book book3 = new Book(3, "Object-Oriented Programming");

        Member member1 = new Member(101, "Alice");
        Member member2 = new Member(102, "Bob");

        member1.borrowBook(book1);
        member1.borrowBook(book2);

        member2.borrowBook(book2);
        member2.borrowBook(book3);

        member1.returnBook(book1);
        member2.returnBook(book2);
    }
}
