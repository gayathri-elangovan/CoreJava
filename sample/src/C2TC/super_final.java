package C2TC;

class vehicle
{
	int maxspeed=120;
}
class car extends vehicle
{
	int maxspeed=180;
	void display()
	{
		System.out.println("Maximum speed"+super.maxspeed);
	}
}
public class super_final {

	public static void main(String[] args) {
		car small=new car();
		small.display();

	}

}
