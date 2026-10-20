/**
Main.java

Functionality for testing Virtual Pet classes
*/
public class Main {
    public static void main(String[] args) {
		// Define starting pets
        Dog dog = new Dog("Buddy");
        Dog secondDog = new Dog("Max");
        Cat cat = new Cat("Luna");

		// Print information about the pets
        System.out.println("Welcome to Virtual Pets, the Land of all Magical pets!");
        dog.bark();
        dog.wagTail();
        secondDog.fetch();
        cat.meow();

        dog.feed();
        cat.play();

        dog.showStatus();
        secondDog.showStatus();
        cat.showStatus();
    }
}
