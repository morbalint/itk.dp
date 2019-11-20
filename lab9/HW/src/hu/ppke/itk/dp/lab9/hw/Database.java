package hu.ppke.itk.dp.lab9.hw;

public interface Database {
    Book findByAuthor(String term);

    Book findByTitle(String term);

    void add(Book book);

    void remove(Book book);
}
