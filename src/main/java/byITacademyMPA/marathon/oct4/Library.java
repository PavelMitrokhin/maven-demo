package byITacademyMPA.marathon.oct4;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void printBooksByAuthor(String author) {
        System.out.println("Book authorized by : " + author + ":");
        for (Book book : books) {
            if (book.getAuthor().contains((CharSequence) author)) {
                System.out.println(book);
            }
        }
    }

    public void printBooksByPublisher(String publisher) {
        System.out.println("Book published by : " + publisher + ":");
        for (Book book : books) {
            if (book.getPublisher().equalsIgnoreCase(String.valueOf(publisher))) {
                System.out.println(book);
            }
        }
    }

    public void printBooksAfterYear(int year) {
        System.out.println("Book published after " + year + ":");;
        for (Book book : books) {
            if (book.getPublishedDate() > year) {
                System.out.println(book);
            }
        }
    }
}
