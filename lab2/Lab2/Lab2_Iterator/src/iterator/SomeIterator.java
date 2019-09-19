package iterator;

import java.util.Iterator;
import java.util.function.Consumer;

public class SomeIterator implements Iterator<Integer> {

    private final Iterator<Integer> it;

    public SomeIterator(SomeClassWithData data) {
        this.it = data.get_data().iterator();
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

    @Override
    public Integer next() {
        return it.next();
    }

    @Override
    public void remove() {
        it.remove();
    }

    @Override
    public void forEachRemaining(Consumer<? super Integer> action) {
        it.forEachRemaining(action);
    }
}
