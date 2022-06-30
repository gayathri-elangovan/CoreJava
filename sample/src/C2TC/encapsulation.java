package C2TC;
class a2
{

	protected void msg()//myself and my child can access method
	{
		System.out.println("Hello");
	}
}
class encapsulation extends a2{

	public static void main(String[] args) {
		a2 aa=new a2();
		aa.msg();
		}
	}
