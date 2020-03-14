package interfaceSnippets;

class ABC implements BB1
{	
	public int methodB(int i)
	{
		return i =+ (i * i);
	}
}

interface BB1
{
	int methodB(int i);
}

public class ISnippet5 
{
	public static void main(String[] args)
	{
		BB1 b = new ABC();					//Interface reference var can hold the object of its child class
		
		System.out.println(b.methodB(2));
	}
}

