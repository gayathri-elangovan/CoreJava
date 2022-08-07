package C2TC;
class base extends Exception{}
class derived extends base{}
public class throwandthrows {

	public static void main(String[] args) {
		try {
			throw new derived();
		}catch(derived d)
		{
			System.out.println("Caught derived class exception");
		}
		catch(base b)
		{
			System.out.println("Caught base class exception");
		}
		

	}//can have multiple catches but cannot have base class catch 
	//before derived catch class

}
