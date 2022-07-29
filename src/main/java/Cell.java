import java.util.Scanner;

/**
 * Класс клетка
 */

public class Cell {

    int size; //Размер

    String name; //Всем нужно имя

    public Cell(String s, String n) {
        switch (s) {
            case "Большая" -> this.size = 3;
            case "Средняя" -> this.size = 2;
            case "Маленькая" -> this.size = 1;
            default -> System.out.printf("А такого размера я не знаю. Mожно выбрать: %nМаленькая %nСредняя %nБольшая");
        }
        this.name = n;
        this.getInfo();
    }

    public Cell divide() {
        Cell res;

        if (this.size > 2) {
            System.out.printf("Деление успешно. %s стала меньше%n", this.name);
            this.size = 1;

            res = new Cell("Маленькая","c2");
        } else {
            System.out.println("Деление не удалось. Маловато будет");
            res = null;
        }

        this.getInfo();
        return res;
    }

    public void grow() {
        if (this.size < 2) {
            System.out.printf("Рост успешен. %s стала больше%n", this.name);
            this.size += 1;
        } else {
            System.out.printf("%s слишком большая. Чтобы вырасти придется поделиться%n", this.name);
        }
        this.getInfo();
    }

    public void getInfo() {
        switch (this.size) {
            case 3 -> System.out.printf("-----------%n %s - Большая%n-----------%n", this.name);
            case 2 -> System.out.printf("-----------%n %s - Средняя%n-----------%n", this.name);
            case 1 -> System.out.printf("-----------%n %s - Маленькая%n-----------%n", this.name);
        }
    }

//    public String newName() {
//        System.out.printf("%nВсем нужно имя)%n");
//        Scanner in = new Scanner(System.in);
//        return in.nextLine();
//    }
}
