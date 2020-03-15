package abstractSnippets;

abstract class Calculate
{
	abstract int add(int a, int b);
}

public class ASnippet1
{
	public static void main(String[] args)
	{
		int result = new Calculate()
		{	
			@Override
			int add(int a, int b)
			{
				return a+b;
			}
		}.add(11010, 022011);
		System.out.println(result);
	}
}

// program is correct result is 20235
