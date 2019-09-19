package iterator;

import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo
{
    public static void main(String[] args)
    {
        SomeClassWithData some_object = new SomeClassWithData();
        for (int i = 9; i > 0; --i)
          some_object.add(i);

        for (SomeIterator it = new SomeIterator(some_object); it.hasNext();)
          System.out.print(it.next() + "  ");
        System.out.println();

//        // Do we really want a client to be able to
//        // trash encapsulated state?
//        data.clear();
//        data = some_object.get_data();
//        System.out.println("size of data is " + data.size());
    }
}