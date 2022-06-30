package C2TC;

class person1
{
	person1()
	{
		System.out.println("person");
	}

	
}
class student3 extends person1
{
	student3()
	{
		super();
		System.out.println("student");
	}

	
}
public class super1 {

	public static void main(String[] args) {
	student3 s=new student3();

	}

}
