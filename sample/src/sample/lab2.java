package sample;

class HelloThread extends Thread
{
	public void run()
	{
		while(true)
		{
			try
			{
			System.out.println("Hello!!!");
			sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread Interrupted");	
			}
		}
	}
}
class GoodMorningThread extends Thread
{
	public void run()
	{
		while(true)
		{
			try
			{
			System.out.println("Good morning!!!");
			sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread Interrupted");	
			}
		}
	}
}
class WelcomeThread extends Thread
{
	public void run()
	{
		while(true)
		{
			try
			{
			System.out.println("Welcome!!!");
			sleep(3000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Thread Interrupted");	
			}
		}
	}
}
public class lab2 {

	public static void main(String[] args)
	{
	HelloThread t1=new HelloThread();
	GoodMorningThread t2=new GoodMorningThread();
	WelcomeThread t3=new WelcomeThread();
	t1.start();
	t2.start();
	t3.start();
	}

}
