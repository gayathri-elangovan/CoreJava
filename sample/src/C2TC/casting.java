package C2TC;
class mob
{
	void call() {
		System.out.println("Calling");
	}
}
class phone extends mob
{
	void call() {
		System.out.println("Calling by samsung");
	}
	void camera() {
		System.out.println("photo and videos");
	}
}
public class casting {

	public static void main(String[] args) {
		mob m=new phone();
		phone p=(phone)m;
		p.call();
		p.camera();

	}

}
