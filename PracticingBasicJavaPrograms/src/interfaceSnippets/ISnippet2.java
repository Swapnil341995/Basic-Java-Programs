package interfaceSnippets;

interface AB
{
	int i = 111;
}

class ISnippet2 implements AB 
{
	void methodB()
	{
		//i = 222;				//the variables in interface are public static and final 
								//and thus these variables cannot be changed.
	}
	
	public static void main(String[] args)
	{
		ISnippet2 IS = new ISnippet2();
	}
}

