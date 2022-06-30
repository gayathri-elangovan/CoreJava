package C2TC;
//import C2TC.stu2;
public class main5 {

	public static void main(String[] args) {
		main2 ss=new stu2(2101709,"Gayu");//upcasting
		stu2 s1=(stu2)ss;//downcasting
		//main2 mm=new main2("Sanjana","Damini");//static=>compile time,less privacy
		s1.dis();
		//mm.dis();
		//System.out.println(ss.uid);//cannot be accessed,its private
		//but can be accessed using getters and setters
		s1.setUid(2101711);
		System.out.println(s1);//tostring()=>fully qualified name with package name class name,@hash value
		

	}

	@Override
	public String toString() {
		return "main5 []";
	}

}

//lazy initialisation , upcasting,late binding=>casting in upward direction=>
//child class object is stored in parent class=>high privacy=>can be used only with overridden method 
//because object creation is done during compilation time