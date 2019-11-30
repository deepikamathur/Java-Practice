package Polymorphism;

public class Dog extends Animal {

	@Override
	public void greeting() {
		// TODO Auto-generated method stub
		System.out.println("Woof!!");
	}

	public void greeting(Dog another) {
		// TODO Auto-generated method stub
		System.out.println("Woooooooof!!");
	}

}
