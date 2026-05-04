package com.sunbeam.SelfLearningQ3;

abstract class Animal {
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public abstract void makeSound();
}

class Food {
	private String type;
	
	public Food(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
}

class Dog extends Animal {
	private Food food;
	
	public Dog(String name, Food food) {
		super(name);
		this.food = food;
	}
	
	@Override
	public void makeSound() {
		System.out.println(name + " barks and eats " + food.getType());
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}
}

class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }
    
    @Override
    public void makeSound() {
        System.out.println(name + " roars");
    }
}

class Zoo {
	private Animal[] animals;
	private int count;
	
	public Zoo(int size) {
		animals = new Animal[size];
		count = 0;
	}
	
	public void addAnimal(Animal a) {
		if(count < animals.length) {
			animals[count] = a;
			count++;
		}else {
			System.out.println("Zoo is full");
		}
	}
	
	public void showAnimals() {
		for(int i=0; i<count; i++) {
			animals[i].makeSound();
		}
	}
}

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoo zoo = new Zoo(3);
		zoo.addAnimal(new Dog("Tommy", new Food("Meat")));
		zoo.addAnimal(new Lion("Simba"));
	
		zoo.showAnimals();
		
	}

}
