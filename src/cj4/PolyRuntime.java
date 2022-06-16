package cj4;
interface Animal     //Run time polymorphism by specialization
{
	void noise();
}
class Lion implements Animal
{
	public void noise()
	{
		System.out.println("Lion Roar");
	}
}
class Dog1 implements Animal
{
	public void noise()
	{
		System.out.println("Dog Barking");
	}
}
class cat implements Animal
{
	public void noise()
	{
		System.out.println("meow");
	}
}
public class PolyRuntime {
 public static void sound(Animal s)
 {
	 s.noise();
 }
 public void sound(Dog1 d3)
 {
	 d3.noise();
 }
 public static void main(String[] args) {
	sound(new Lion());
	PolyRuntime poly=new PolyRuntime();
	poly.sound(new Dog1());
}
}



