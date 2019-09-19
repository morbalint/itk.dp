package iterator;

import java.util.Collection;
import java.util.TreeSet;

public class SomeClassWithData
{
    private TreeSet < Integer > m_data = new TreeSet < Integer > ();

    public void add(int in)
    {
        m_data.add(in);
    }
    public Collection get_data()
    {
        return m_data;
    }
}