package cj4;

interface animal1   // run time polymorphism by generialization
{
	void noise();
}
class frog implements animal1
{
	public void noise()
	{
		System.out.println("meow");
	}
}
class rat implements animal1
{
	public void noise()
	{
		System.out.println("kiszzzzs");
	}
}
public class PolyRuntime2 {
	public static void Sound(animal1 a2)
	{
		a2.noise();
	}
	public static void main(String[] args)
	{
		Sound(new frog());
		Sound(new rat());
	}

}
