package abstractSnippets;

abstract class ABC
{
	abstract void methodOne();
}

abstract class XYZ1 extends ABC
{
	int i;
	
	@Override
	void methodOne()
	{
		methodOne(i *= i);
	}
	
	abstract void methodOne(int i);
}

class PQR1 extends XYZ1
{
	public PQR1(int i)
	{
		this.i = i;
	}
	
	@Override
	void methodOne(int i)
	{
		System.out.println(i++ * ++i);
	}
}

public class ASnippet11
{
	public static void main(String[] args)
	{
		PQR1 pqr = new PQR1(1);
		
		pqr.methodOne();
	}		
}
