package ZooManagement;

public class Dog extends Animal {
	Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Bark");
    }
}
