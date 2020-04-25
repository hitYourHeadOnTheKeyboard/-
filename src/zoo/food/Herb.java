package zoo.food;

public abstract class Herb extends Food{
    String typeOfHerb;

    public Herb(int weight) {
        super(weight);
    }

    public String getTypeOfHerb() {
        return typeOfHerb;
    }
}
