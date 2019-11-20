package hu.ppke.itk.dp.lab9.hw;

import java.util.List;

public class UnifiedDatabase implements Database {

    public final List<Database> dbs;

    public UnifiedDatabase(List<Database> dbs) {
        this.dbs = dbs;
    }

    @Override
    public Book findByAuthor(String term) {
        return dbs.stream().map(x -> x.findByAuthor(term)).filter(x -> x != null).findFirst().orElse(null);
    }

    @Override
    public Book findByTitle(String term) {
        return dbs.stream().map(x -> x.findByTitle(term)).filter(x -> x != null).findFirst().orElse(null);
    }

    @Override
    public void add(Book book) {
        dbs.get(0).add(book);
    }

    @Override
    public void remove(Book book) {
        for (Database db : dbs) {
            db.remove(book);
        }
    }
}
