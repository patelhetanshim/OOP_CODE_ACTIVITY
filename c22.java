class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) {
        super(msg);
    }
}

class Library {
    int availableBooks;

    Library(int books) {
        availableBooks = books;
    }

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
            System.out.println("Remaining books: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

public class c22 {
    public static void main(String[] args) {
        Library lib = new Library(3);

        try {
            System.out.println("Issuing 2 books...");
            lib.issueBook(2);

            System.out.println("Issuing 2 more books...");
            lib.issueBook(2);

        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Library transaction completed");
        }
    }
}