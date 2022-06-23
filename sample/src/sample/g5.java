package sample;

class thread1 extends Thread
{
	public void run()
	{
		for(int i=5;i>0;i++)
		{
			System.out.println("thread1.i="+i);
		}
		System.out.println("existing from thread1");
	}
}
class thread2 implements Runnable
{
	public void run()
	{
		for(int j=5;j>0;j++)
		{
			System.out.println("thread2.j="+j);
		}
		System.out.println("existing from thread2");
	}
}
public class g5 {
	public static void main(String args[])
	{
		thread1 a=new thread1();
		a.start();
		thread2 b=new thread2();
		Thread t1=new Thread(b);
		t1.start();
	}

}
