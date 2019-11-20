package hu.ppke.itk.dp.lab9.hw;

import org.jetbrains.annotations.Contract;

public class Book {
    private final String author;
    private final String title;
    private final String location;

    @Contract(pure = true)
    public Book(String author, String title, String location) {
        this.author = author;
        this.title = title;
        this.location = location;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }
}
