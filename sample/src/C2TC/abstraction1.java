package C2TC;
abstract class test3
{
	public abstract void m1();
	void m2()
	{
		System.out.println("Normal-method");
	}
}
public class abstraction1 extends test3 {
	public void m1()
	{
		System.out.println("m1-method");
	}

	public static void main(String[] args) {
		abstraction1 a=new abstraction1();
		a.m1();
		a.m2();
		

	}

}//can't create objects of abstract class ,but subclass can create objects
