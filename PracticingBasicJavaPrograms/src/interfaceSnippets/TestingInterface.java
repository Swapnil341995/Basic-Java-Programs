package interfaceSnippets;

interface A
{
	void myMethod();
	int i = 111;
}
class B
{
	public void myMethod()				//It is very important to add public access specifier in
										//overrided method of interface since the default access
										//specifier is default and that of interface is public.
	{
		System.out.println("myMethod");
	}
}
class Cc extends B implements A
{
	
}
public class TestingInterface
{
	public static void main(String[] args) 
	{
		A a = new Cc();
		a.myMethod();
	}
}