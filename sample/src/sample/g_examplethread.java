package sample;

class thread4 extends Thread
{
	public void run()
	{
		System.out.println("Number from 0 to 10:");
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
public class g_examplethread {

	public static void main(String[] args) {
		thread4 t1=new thread4();
		t1.start();

	}

}
