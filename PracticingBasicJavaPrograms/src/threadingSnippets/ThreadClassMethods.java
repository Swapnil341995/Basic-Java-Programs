package threadingSnippets;

import java.util.concurrent.locks.Lock;

public class ThreadClassMethods extends Thread
{
	public void run()
	{
		for(int i = 0;i < 10;i++)
		{
			System.out.println("i is "+i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		ThreadClassMethods tcm1 = new ThreadClassMethods();
		System.out.println("Starting tcm1 ...");
		tcm1.start();
		//tcm1.join();
		System.out.println("yielding tcm1 ...");
		tcm1.yield();
		
		ThreadClassMethods tcm2 = new ThreadClassMethods();
		System.out.println("Starting tcm2 ...");
		tcm2.start();
//		tcm2.yield();
//		tcm1.notify();
		
		tcm1.setName("ThreAD-1");
		System.out.println(tcm1.getName());
		System.out.println(tcm2.getName());
		
	}
}
