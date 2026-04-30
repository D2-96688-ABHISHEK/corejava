package ZooManagement;

public class Animal {
	String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Animal makes sound");
    }

    void display() {
        System.out.println("Animal: " + name);
    }
}
