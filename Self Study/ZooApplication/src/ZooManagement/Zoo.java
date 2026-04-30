package ZooManagement;
import java.util.ArrayList;


public class Zoo {
	 private ArrayList<Animal> animals = new ArrayList<>();

	    void addAnimal(Animal a) {
	        animals.add(a);
	    }

	    void showAnimals() {
	        for (Animal a : animals) {
	            a.display();
	            a.makeSound();
	            System.out.println();
	        }
	    }
}
