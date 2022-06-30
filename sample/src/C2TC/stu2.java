package C2TC;

public class stu2 extends main2 {

private int uid;
private String name;
public stu2(int uid, String name) {
	super("Sanjana","Damini");
	this.uid = uid;
	this.name = name;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
void dis()
{
	System.out.println(uid +" : "+ name);
}
@Override//annotations=>tells compiler to checks rules for overrridden()
public String toString() {
	return "stu2 [uid=" + uid + ", name=" + name + "]";
}
}
