package Beans;
@FunctionalInterface
public interface InterfaceClass {

	 public static final int a=10;//By Default it is represent as this  
	
	//void showVariableA();
	default void print()
	{
		System.out.println("This call from Interface class");
		print2();
	}
	public abstract void ShowName(String name);
	
	private void print2()
	{
		System.out.println("This call from Interface class of Private method");
	}
	
	private void Atul()
	{
		
	}
}
