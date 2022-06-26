package C2TC;
class test{
	String str;
	test()
	{
			str="Hello Gayathri!!";
	}
	void display(test obj)
	{
		System.out.println(str);
	}
	void get()
	{
		display(this);
	}
}
public class this_ex {

	public static void main(String[] args) {
		test obj=new test();
		obj.get();

	}

}
