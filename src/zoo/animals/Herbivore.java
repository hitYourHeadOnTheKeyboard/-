package zoo.animals;

import zoo.food.Food;
import zoo.food.Herb;
import zoo.food.Meat;

public abstract class Herbivore extends Animal {
    private String name;
    private int age;

    public Herbivore(String name, int age) {
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
        if (food instanceof Meat) {
            System.out.println("Я травоядный веган, уберите труп этого животного!");
        }else if (food instanceof Herb) {
            System.out.println("Эта свежая трава - то, что надо. Спасибо!");
        }
    }
}
