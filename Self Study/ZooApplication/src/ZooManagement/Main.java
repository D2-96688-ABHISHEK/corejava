package ZooManagement;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();

        Animal d1 = new Dog("Tommy");
        Animal l1 = new Lion("Simba");

        zoo.addAnimal(d1);
        zoo.addAnimal(l1);

        zoo.showAnimals();

	}

}
