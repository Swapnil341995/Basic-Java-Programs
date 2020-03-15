package abstractSnippets;

class X2
{
	abstract static class Y
	{
		abstract void methodY();
	}
}
class Z extends X2.Y		// how to use methods of inner abstract classes
{
	@Override
	void methodY()
	{
		System.out.println("methodY implementation");
	}
}
