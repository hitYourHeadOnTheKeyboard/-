package zoo;

import zoo.animals.Herbivore;
import zoo.food.Food;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AviaryForHerbivore {
    private List<Herbivore> animals = new ArrayList<>();
    private int maxAnimals;
    private int animalsCount = 0;

    public AviaryForHerbivore(int maxAnimals) {
        this.maxAnimals = maxAnimals;
    }

    public void addAnimal(Herbivore animal) {
        if (animalsCount == maxAnimals) {
            System.out.println("В вольере больше нет места!");
            return;
        }
        animals.add(animal);
        animalsCount++;
    }

    public void pettingAnimal() {
        if (animalsCount == 0) {
            System.out.println("Извините, вольер пустой, животные уехали в отпуск.");
            return;
        }
        int animalIndex = 0;
        System.out.println("Какое этих животных вы бы хотели погладить? Напишите номер: ");

        for (int i = 0; i < animals.size(); i++) {
            System.out.println(i + ". " + animals.get(i).getName());
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            animalIndex = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (animalIndex > animalsCount) {
            System.out.println("Здесь нет животного с таким номером");
            return;
        }
        System.out.println("Класс! Вы погладили " + animals.get(animalIndex).getName());
    }

    public void feedAnimal(Food food) {
        if (animalsCount == 0) {
            System.out.println("Извините, вольер пустой, животные уехали в отпуск.");
            return;
        }
        int animalIndex = 0;

        System.out.println("Какое из этих животных вы бы хотели покормить? Напишите номер: ");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(i + ". " + animals.get(i).getName());
        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            animalIndex = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (animalIndex > animalsCount) {
            System.out.println("Здесь нет животного с таким номером");
            return;
        }
        animals.get(animalIndex).eat(food);
        System.out.println("Вы покормили " + animals.get(animalIndex).getName());
    }
}
