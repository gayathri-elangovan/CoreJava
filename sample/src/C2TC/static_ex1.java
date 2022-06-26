package C2TC;

public class static_ex1 {
	static int x=10;
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		static_ex1 st1=new static_ex1();
		static_ex1 st2=new static_ex1();
		st1.x=20;
		System.out.println(st1.x+" ");
		System.out.println(st2.x);

	}

}
