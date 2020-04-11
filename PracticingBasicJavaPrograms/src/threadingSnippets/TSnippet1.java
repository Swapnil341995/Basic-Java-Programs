package threadingSnippets;

public class TSnippet1 extends Thread
{
		@Override
		public void run() {
			for(int i = 0;i < 5;i++)
			{
				System.out.println("i is "+i);
			}
		}
	
	public static void main(String[] args) throws InterruptedException
	{

		TSnippet1 ts1 = new TSnippet1();
		ts1.start();
		synchronized (ts1)
		{
			ts1.wait();
		}
		
		TSnippet1 ts2 = new TSnippet1();
		ts2.start();
		
	}

}
