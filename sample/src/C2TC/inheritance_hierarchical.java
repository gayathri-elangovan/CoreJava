package C2TC;
class person{
	int id;
	void printid(int id)
	{
		System.out.println("ID:"+id);
	}
}
class student extends person{
	void iden()
	{
		System.out.println("Student's");
	}
}
class teacher extends person{
	void iden()
	{
		System.out.println("Teacher's");
	}
}
public class inheritance_hierarchical {

	public static void main(String[] args) {
		student s=new student();
		s.iden();
		s.printid(2101709);
		teacher t=new teacher();
		t.iden();
		t.printid(1001);

	}

}
