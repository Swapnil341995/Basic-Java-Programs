package abstractSnippets;

abstract class A1
{
	int i = 111, j = 222;
	
	abstract void methodOne();
	
	abstract void methodTwo();
}

abstract class B1 extends A1
{
	@Override
	void methodOne()
	{
		System.out.println(i);
		
		System.out.println(j);
		
		i = ++i;
		
		j = --j;
	}
}

class C1 extends B1
{
	@Override
	void methodTwo()
	{
		System.out.println(i);
		
		System.out.println(j);
		
		i = i++;
		
		j = j--;	
	}
}

public class ASnippet8
{
	public static void main(String[] args)
	{
		C1 c = new C1();
		
		c.methodOne();
		
		c.methodTwo();
		
		System.out.println(c.i);
		
		System.out.println(c.j);
	}
}

//output----------	111
//					222
//					112
//					221
//					112
//					221