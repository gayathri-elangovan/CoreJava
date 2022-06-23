package sample;

class animal
{
	void eat()
	{
		System.out.println("eating");
	}
}
class dog extends animal
{
	void bark()
	{
		System.out.println("barking");
	}
}
class kitten extends animal
{
	void play()
	{
		System.out.println("playing");
	}
}
class cat extends animal
{
	void meow()
	{
		System.out.println("meowing");
	}
}
public class inheritance {

	public static void main(String[] args) {
		kitten k=new kitten();
		cat c=new cat();
		dog d=new dog();
		k.play();
		d.bark();
		k.eat();
		d.eat();
	c.meow();
		

	}

}
