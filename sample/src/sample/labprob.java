package sample;

class expro extends Thread
{
	public void run()
	{
		System.out.println("Numbers from 0 to 10");
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);	
		}
	}
}
public class labprob {

	public static void main(String[] args) {
		expro t1=new expro();
		t1.start();
	}


}
