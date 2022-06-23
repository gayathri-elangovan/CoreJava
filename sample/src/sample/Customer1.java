package sample;

public class Customer1 implements Customer {
	private String product;
	public void notifyCustomer(Object o)
	{
		this.product=(String) o;
		getProduct();
	}
	public void getProduct()
	{
		System.out.println(product+ "available!");
	}

}
