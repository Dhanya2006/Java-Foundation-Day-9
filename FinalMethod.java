package Day9;
class Animal{
	final void eat() {
		System.out.println("animal is eating");
	}
}
class Dog extends Animal{
	
}
public class FinalMethod {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		

	}

}
