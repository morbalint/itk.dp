package hu.ppke.itk.dp.lab9.hw;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class DatabaseAdapter implements Database {

    private final LegacyDatabase database;

    @Contract(pure = true)
    public DatabaseAdapter(LegacyDatabase database) {
        this.database = database;
    }

    @Override
    public Book findByAuthor(String term) {
        return find(term, x -> x.getAuthor());
    }

    @Override
    public Book findByTitle(String term) {
        return find(term, x -> x.getTitle());
    }

    private Book find(String term, Function<Book, String> fieldSelector){
        Optional<Book> fullMatch =  database.books
                .stream()
                .map(this::bookFromString)
                .filter(x -> fieldSelector.apply(x) == term)
                .findFirst();
        if(fullMatch.isPresent()) {
            return fullMatch.get();
        }
        else {
            Optional<Book> startsWithMatch = database.books
                    .stream()
                    .map(this::bookFromString)
                    .filter(x -> fieldSelector.apply(x).startsWith(term))
                    .findFirst();
            return startsWithMatch.orElse(null);
        }
    }

    private Book bookFromString(@NotNull String legacyBook){
        Integer authorLength = legacyBook.indexOf('|');
        String author = legacyBook.substring(0, authorLength);
        Integer titleEndPos = legacyBook.indexOf('|', authorLength+1);
        String title = legacyBook.substring(authorLength+1, titleEndPos);
        String location = legacyBook.substring(titleEndPos+1);
        return new Book(author, title, location);
    }

    @Override
    public void add(Book book) {
        String legacyFormat = stringFromBook(book);
        database.books.add(legacyFormat);
    }

    @Override
    public void remove(Book book) {
        String legacyFormat = stringFromBook(book);
        database.books.remove(legacyFormat);
    }

    private String stringFromBook(@NotNull Book book){
        return book.getAuthor() + '|' + book.getTitle() + '|' + book.getLocation();
    }
}
