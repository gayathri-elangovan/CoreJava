package C2TC;
class area{
	void findarea(int a)
	{
		System.out.println("Area of square :"+(a*a));
	}
	void findarea(int l,int b)
	{ int area=l*b;
		System.out.println("Area of rectangle :"+area);
	}
	void findarea(float b,int h)
	{ float area=(float)(0.5*b*h);
		System.out.println("Area of triangle :"+area);
	}
	void findarea(int b,float h)
	{ float area=(float)(b*h);
		System.out.println("Area of parallelogram :"+area);
	}
	
	
 }
public class Polymorphism {

	public static void main(String[] args) {
		area a=new area();
		a.findarea(5);
		a.findarea(5, 2);
		a.findarea(10f, 5);
		a.findarea(5, 10f);
		a.findarea(5, 10.0f);//10.0 is double
	}

}
