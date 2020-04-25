package zoo.animals;

import zoo.food.Food;

public abstract class Animal {
    private String name;
    private int age;

    abstract void eat(Food food);

    abstract String getName();

    abstract int getAge();
}
