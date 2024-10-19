package byITacademyMPA.marathon.oct4;

import java.util.ArrayList;
import byITacademyMPA.marathon.oct4.*;

public class MainBook {
    public static void main(String[] args) {
        Library library1 = new Library();
        library1.addBook(new Book("b0001", "War and Peace", "L.N.Tolstoy", "Gosizdat",
                1974, 2091, 1.30, "firm"));
        library1.addBook(new Book("b0002", "War and Peace", "L.N.Tolstoy", "Lenizdat",
                1974, 2084, 1.40, "firm"));
        library1.addBook(new Book("b0003", "Crime and Punishment", "F.M.Dostoevsky", "Gosizdat",
                1974, 812, 1.15, "firm"));
        library1.addBook(new Book("b0004", "Crime and Punishment", "F.M.Dostoevsky", "Gosizdat",
                1976, 754, 0.83, "soft"));
        library1.addBook(new Book("b0004", "Evgeny Onegin", "A.S.Pushkin", "Lenizdat",
                1976, 58, 0.66, "soft"));

        String author1 = "F.M.Dostoevsky";
        library1.printBooksByAuthor(author1);

        String publisher1 = "Lenizdat";
        library1.printBooksByPublisher(publisher1);

        int year1 = 1975;
        library1.printBooksAfterYear(year1);

    }
}
