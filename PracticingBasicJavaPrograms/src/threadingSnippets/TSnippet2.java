package threadingSnippets;

public class TSnippet2 implements Runnable
{
	public static void main(String[] args)
	{
		TSnippet2 ts1 = new TSnippet2();
		Thread t1 = new Thread(ts1);
		t1.start();
		
		TSnippet2 ts2 = new TSnippet2();
		Thread t2 = new Thread(ts2);
		t2.start();
	}

	public void run()
	{
		for(int i = 0;i < 6;i++) 
		{
			System.out.println("i is "+i);
		}
	}
}
