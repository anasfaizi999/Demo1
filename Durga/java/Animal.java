package Durga.java;

class Animal {
}
class Monkey extends Animal
{
}
class TestDemo
{
	public void m1(Animal a)
	{
		System.out.println("Animal verion");
		}
	public void m1(Monkey m)
	{
		System.out.println("Monkey version");
		}
	
	public static void main(String[] args) {
		TestDemo t = new TestDemo();
		Animal a = new Animal();
		t.m1(a);
		Monkey m = new Monkey();
		t.m1(m);
	}
	
	
}
