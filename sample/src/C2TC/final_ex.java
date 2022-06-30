package C2TC;

class person3 //final class person3=>compile time error
{
	void mes()
	{
		System.out.println("This is person class");
	}
}
class student11 extends person3
{
	void mes() {
		System.out.println("This is student class");
	}
	void display() {
		mes();super.mes();
	}
}
public class final_ex {

	public static void main(String[] args) {
		student11 s1=new student11();
		s1.display();

	}

}
//final variable can't change value
//final method can't be overridden but can be over loaded
//final class can't be inherited
