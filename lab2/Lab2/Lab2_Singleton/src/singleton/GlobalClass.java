package singleton;

public class GlobalClass
{
    private static  GlobalClass instance;

    public static GlobalClass getInstance()
    {
        if(instance == null)
        {
            instance = new GlobalClass();
        }
        return instance;
    }

    protected int m_value;
    
    protected GlobalClass() {
    		m_value = 0;
    }

    public int get_value()
    {
        return m_value;
    }
    public void set_value(int v)
    {
        m_value = v;
    }
};