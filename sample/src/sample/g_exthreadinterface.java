package sample;

class Interfacethread implements Runnable
{
	public void run()
	{
		System.out.println("Numbers from 0 to 10:");
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}
public class g_exthreadinterface {

	public static void main(String[] args) {
		 Interfacethread it=new  Interfacethread();
		 Thread t=new Thread(it);
		 t.start();
		

	}

}
