package C2TC;

public class stu{
public stu(int uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
	}
int uid;
String name;
void attending()
{
	System.out.println("The sessions are been attended by "+
							uid+": " +name);
}
}

