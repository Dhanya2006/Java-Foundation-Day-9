package Day9;
class Animal{
	void sound() {
		System.out.println("Animal makes a sound");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("dog says bark");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Animal a = new Dog();
		a.sound();

	}

}
