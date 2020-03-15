package abstractSnippets;

abstract class Aa
{
	abstract int firstMethod(int i);
	
	abstract int secondMethod(int i);
	
	int thirdMethod(int i)
	{
		return secondMethod(++i);
	}
}

abstract class Bb extends Aa
{
	@Override
	int secondMethod(int i)
	{
		return firstMethod(++i);
	}
}

class Cc extends Bb
{
	@Override
	int firstMethod(int i)
	{
		return ++i;
	}
}

public class ASnippet4
{
	public static void main(String[] args)
	{
		Cc c = new Cc();
		
		System.out.println(c.thirdMethod(121121));
	}
}

//output ---- 121124
