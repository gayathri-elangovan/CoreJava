package C2TC;

class a
{
	void method()
	{
		System.out.println("From class A");
	}
}
class b extends a
{
	void method()
	{
		System.out.println("From class B");
	}
}
public class overriding {
	public static void main(String[] args) {
		
		a a1=new a();
		a1.method();
		b b1=new b();
		b1.method();
	}

}
