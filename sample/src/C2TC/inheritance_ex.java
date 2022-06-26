package C2TC;


public class inheritance_ex {
	public inheritance_ex(String techtrainername, String sstrainername) {
		super();
		this.techtrainername = techtrainername;
		this.sstrainername = sstrainername;
	}

	String techtrainername;
	String sstrainername;
	

	void conducting() {
		System.out.println("Session is been conducted by "+ 
	techtrainername+" and "+sstrainername);
		
	}

	public static void main(String[] args) {
		

	}

}
