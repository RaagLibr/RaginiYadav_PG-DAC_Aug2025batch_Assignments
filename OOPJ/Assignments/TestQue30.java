import java.util.ArrayList;
import java.util.List;

public class TestQue30 {

    // Book class with encapsulated fields
    static class Book {
        private int bookId;
        private String title;
        private String author;

        public Book(int bookId, String title, String author) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
        }

        // Getters
        public int getBookId() {
            return bookId;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }

    // Abstract LibraryMember class
    static abstract class LibraryMember {
        private int memberId;
        private String name;
        private static int idCounter = 1;

        protected List<Book> borrowedBooks;

        public LibraryMember(String name) {
            this.name = name;
            this.memberId = idCounter++;
            this.borrowedBooks = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public int getMemberId() {
            return memberId;
        }

        // Abstract method to borrow book
        public abstract boolean borrowBook(Book book);

        public int getBorrowedBookCount() {
            return borrowedBooks.size();
        }
    }

    // Interface Notifyable
    interface Notifyable {
        void sendNotification(String message);
    }

    // StudentMember class
    static class StudentMember extends LibraryMember implements Notifyable {
        private static final int MAX_BOOKS = 3;

        public StudentMember(String name) {
            super(name);
        }

        @Override
        public boolean borrowBook(Book book) {
            if (borrowedBooks.size() < MAX_BOOKS) {
                borrowedBooks.add(book);
                return true;
            } else {
                System.out.println("StudentMember " + getName() + " cannot borrow more than " + MAX_BOOKS + " books.");
                return false;
            }
        }

        @Override
        public void sendNotification(String message) {
            System.out.println("Notification sent to " + getName() + ": " + message);
        }
    }

    // FacultyMember class
    static class FacultyMember extends LibraryMember implements Notifyable {
        private static final int MAX_BOOKS = 5;

        public FacultyMember(String name) {
            super(name);
        }

        @Override
        public boolean borrowBook(Book book) {
            if (borrowedBooks.size() < MAX_BOOKS) {
                borrowedBooks.add(book);
                return true;
            } else {
                System.out.println("FacultyMember " + getName() + " cannot borrow more than " + MAX_BOOKS + " books.");
                return false;
            }
        }

        @Override
        public void sendNotification(String message) {
            System.out.println("Notification sent to " + getName() + ": " + message);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book(1, "Java Programming", "Author A");
        Book book2 = new Book(2, "Data Structures", "Author B");
        Book book3 = new Book(3, "Operating Systems", "Author C");
        Book book4 = new Book(4, "Database Systems", "Author D");
        Book book5 = new Book(5, "Computer Networks", "Author E");

        // Create members
        StudentMember student = new StudentMember("Amit");
        FacultyMember faculty = new FacultyMember("Prof. Singh");

        // Student borrows 2 books
        student.borrowBook(book1);
        student.borrowBook(book2);
        System.out.println("StudentMember " + student.getName() + " borrowed " + student.getBorrowedBookCount() + " books");

        // Faculty borrows 4 books
        faculty.borrowBook(book1);
        faculty.borrowBook(book2);
        faculty.borrowBook(book3);
        faculty.borrowBook(book4);
        System.out.println("FacultyMember " + faculty.getName() + " borrowed " + faculty.getBorrowedBookCount() + " books");

        // Send notifications
        student.sendNotification("Return books within 7 days");
        faculty.sendNotification("Return books within 7 days");
    }
}
