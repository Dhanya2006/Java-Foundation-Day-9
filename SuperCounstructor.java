package Day9;
class Animal{
	Animal(){
		System.out.println("Animal constructor");
	}
}
class Dog extends Animal{
	Dog(){
		super();
		System.out.println("dog constructor");
	}
}
public class SuperCounstructor {

	public static void main(String[] args) {
		Dog d = new Dog();

	}

}
