package hu.ppke.itk.dp.lab9.hw;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class ModernDatabase implements Database {

    private final Map<String, Book> authorIndex = new TreeMap<>();
    private final Map<String, Book> titleIndex = new TreeMap<>();

    @Override
    public Book findByAuthor(String term){
        return findByTerm(term, authorIndex);
    }

    @Override
    public Book findByTitle(String term){
        return findByTerm(term, titleIndex);
    }

    private Book findByTerm(String term, Map<String, Book> index){
        if(index.containsKey(term)){
            return index.get(term);
        }
        else{
            Optional<String> author = index.keySet().stream().filter(x -> x.startsWith(term)).findFirst();
            if(author.isPresent()){
                return index.get(author.get());
            }
            else {
                return null;
            }
        }
    }

    @Override
    public void add(Book book){
        authorIndex.put(book.getAuthor(), book);
        titleIndex.put(book.getTitle(), book);
    }

    @Override
    public void remove(Book book) {
        authorIndex.remove(book.getAuthor());
        titleIndex.remove(book.getTitle());
    }

}
