package hu.ppke.itk.dp.lab9.hw;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Database legacy = new DatabaseAdapter(new LegacyDatabase());
        Database modern = new ModernDatabase();
        legacy.add(new Book("J. R. R. Tolkien", "The fellowship of the ring", "shelf A"));
        legacy.add(new Book("J. R. R. Tolkien", "The two towers", "shelf A"));
        legacy.add(new Book("J. R. R. Tolkien", "The return of the King", "shelf A"));
        modern.add(new Book("George R. R. Martin", "Feast for crows", "shelf B"));
        modern.add(new Book("John Scalzi", "Old man's war", "shelf C"));
        modern.add(new Book("Alistar Reynolds", "Redemption Ark", "shelf C"));
        Database theSource = new UnifiedDatabase(List.of(modern, legacy));

        find("Old", theSource::findByTitle);
        find("The two towers", theSource::findByTitle);
        find("The Hobbit", theSource::findByTitle);
        find("J. R. R.", theSource::findByAuthor);
        find("Alistar Reynolds", theSource::findByAuthor);
        find("Isaac Asimov", theSource::findByAuthor);
    }

    private static void find(String term, @NotNull Function<String, Book> finder){
        Book book = finder.apply(term);
        if(book == null) {
            System.out.println("No such books found.");
        }
        else {
            System.out.println("Book with title '" + book.getTitle() + "' found.");
        }
    }
}
