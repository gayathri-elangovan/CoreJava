package C2TC;
class ani
{
	void sound() {
		System.out.println("Animal");
	}
}
class cat extends ani
{
	void sound()
	{
		System.out.println("Meows");
	}
}
class lion extends ani
{
	void sound()
	{
		System.out.println("roars");
	}
}
public class upcasting {

	public static void main(String[] args) {
		ani a;
		a=new cat();
		a.sound();
		a=new lion();
		a.sound();

	}

}
