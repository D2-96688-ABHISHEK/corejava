package ZooManagement;

public class Lion extends Animal {
	Lion(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Roar");
    }
}
