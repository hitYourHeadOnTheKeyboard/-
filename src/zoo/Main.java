package zoo;

import zoo.animals.*;
import zoo.food.*;

import java.io.*;

/**
 * Эта программа создана для отработки навыков использования
 * абстрактных классов. Здесь представлены зоопарк и некоторые виды
 * животных.
 * @author Sergey Krylov
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        AviaryForHerbivore aviary1 = new AviaryForHerbivore(5);
        aviary1.addAnimal(new Rabbit("Роджер", 2));
        aviary1.addAnimal(new Panda("Сара", 4));
        aviary1.addAnimal(new Cow("Машка", 10));
        aviary1.addAnimal(new Panda("Джек", 4));

        AviaryForCarnivorous aviary2 = new AviaryForCarnivorous(7);
        aviary2.addAnimal(new Tiger("Олег", 15));
        aviary2.addAnimal(new Tiger("Арча", 12));
        aviary2.addAnimal(new Weasel("Меховушка", 2));
        aviary2.addAnimal(new Wolf("Лёд", 10));
        aviary2.addAnimal(new Wolf("Пламя", 6));

        System.out.println("Вы идете по зоопарку, справа вольер с хищниками," +
                                " слева - с травоядными... К какому подойдёте? " +
                                        "1 - правый, 2 - левый. Введите число: ");
        int numberOfAviary = Integer.parseInt(reader.readLine());
        int number1 = 0;
        int number2 = 0;

        if (numberOfAviary == 1) {
            System.out.println("Хорошо, подходим к вольеру с хищниками...");
            System.out.println("Вы можете: 1. сделать фото с хищником; 2. покормить его. Введите число: ");
            number1 = Integer.parseInt(reader.readLine());
            if (number1 == 1) {
                aviary2.makePhotoWithAnimal();
            }else if (number1 == 2) {
                aviary2.feedAnimal(new Venison(2));
            }
        }else if (numberOfAviary == 2) {
            System.out.println("Хорошо, подходим к вольеру с травоядными...");
            System.out.println("Вы можете: 1. Погладить животное; 2. Покормить его. Введите число: ");
            number2 = Integer.parseInt(reader.readLine());
            if (number2 == 1) {
                aviary1.pettingAnimal();
            }else if (number2 == 2) {
                aviary1.feedAnimal(new Nettle(500));
            }
        }
        System.out.println("Зоопарк закрывается! Всего доброго.");
        reader.close();
    }

}
