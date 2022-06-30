package C2TC;


public class main2 {

	private String techtrainer;
	private String softskilltrainer;
	public main2(String techtrainer, String softskilltrainer) {
		super();
		this.techtrainer = techtrainer;
		this.softskilltrainer = softskilltrainer;
	}
	void dis()
	
	{
		System.out.println("The Class is conducted by "+
				techtrainer+" and "+softskilltrainer);
	}
	@Override
	public String toString() {
		return "main2 [techtrainer=" + techtrainer + ", softskilltrainer=" + softskilltrainer + "]";
	}
	

}
