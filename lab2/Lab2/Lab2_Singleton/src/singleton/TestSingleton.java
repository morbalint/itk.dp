package singleton;

public class TestSingleton {
	public static void foo()
	{
	  // Initialization on first use
	  GlobalClass instance = GlobalClass.getInstance();
	  instance.set_value(1);
	  System.out.println("foo: global_ptr is " + instance.get_value() + ", and the instance is: " + instance + "\n");
	}
	
	public static void bar()
	{
	  // Initialization on first use
	  GlobalClass instance = GlobalClass.getInstance();
	  instance.set_value(2);
	  System.out.println("bar: global_ptr is " + instance.get_value() + ", and the instance is: " + instance + "\n");
	}
	
	public static void main(String[] args) {
		GlobalClass instance = GlobalClass.getInstance();
		System.out.println("main: global_ptr is " + instance.get_value() + ", and the instance is: "+instance + "\n");
		foo();
		bar();
	}
	
}
