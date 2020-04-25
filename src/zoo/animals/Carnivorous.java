package zoo.animals;

import zoo.food.Food;
import zoo.food.Herb;
import zoo.food.Meat;

public abstract class Carnivorous extends Animal {
    private String name;
    private int age;

    public Carnivorous(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Herb) {
            System.out.println("Я хищник, сам ешь свою траву!");
        }else if (food instanceof Meat) {
            System.out.println("Спасибо, этот стейк был изумителен!");
        }
    }
}
