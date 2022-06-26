package C2TC;
class flower
{
	void colour()
	{
		System.out.println("based on flower");
	}
}
class red extends flower
{
	void colour1()
	{
		System.out.println("blood");
	}
}
class blue extends red
{
	void colour2()
	{
		System.out.println("sky");
	}
}
public class inheritance{
	public static void main(String args[])
	{
		blue d=new blue();
		d.colour2();
		d.colour1();
		d.colour();
	}

}
