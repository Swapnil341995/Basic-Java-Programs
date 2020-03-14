package interfaceSnippets;

interface I111
{
	class C implements I
	{
		public void methodI(int i)
		{
			System.out.println(i);
		}
	}
	
	void methodI(int i);
}

// IS there any error?
// There are no errors
