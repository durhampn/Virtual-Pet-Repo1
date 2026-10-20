/**
Main.java

Functionality for testing Virtual Pet classes
*/
public class Main {
    public static void main(String[] args) {
		// Define starting pets
        Dog dog = new Dog("Miyabi");
        Cat cat = new Cat("ChaCha");

		// Print information about the pets
        System.out.println("Welcome to Virtual Pets, the Land of all Magical pets!");
        
        dog.bark();
        cat.meow();
        cat.purr();
        cat.scratch();

        dog.feed();
        cat.play();

        dog.showStatus();
        cat.showStatus();
    }
}
