package zoo.food;

public abstract class Meat extends Food {
    String typeOfMeat;

    public Meat(int weight) {
        super(weight);
    }

    public String getTypeOfMeat() {
        return typeOfMeat;
    }
}
