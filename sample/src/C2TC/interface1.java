package C2TC;
interface firstinterface
{
	public void mymethod();
}
interface secondinterface
{
	public void myothermethod();
}	
	
	class democlass implements firstinterface,secondinterface{
public void mymethod()
{
	System.out.println("First interface");
}
public void myothermethod()
{
	System.out.println("Second interface");
}
	}
	public class interface1{
	public static void main(String[] args) {
		democlass d=new democlass();
		d.mymethod();
		d.myothermethod();

	}

}
