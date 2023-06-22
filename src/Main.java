import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число: ");
        if (console.hasNextDouble()) {
            double number = console.nextDouble();
            if (number > 7) {
                System.out.println("Привет");
            }
        } else {
            System.out.println("Вы ввели не число! Повторите попытку.");
        }

    }


    public static void task2() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = console.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public static void task3() {
        /*Scanner console = new Scanner(System.in);
        System.out.println("Введите элементы массива: ");
        double[] array = new double[5];
        for (int i = 0; i < 5; i++) {
            if (console.hasNextDouble()) {
                array[i] = console.nextDouble();
            }
        }
        System.out.println("Элементы массива кратные 3:");
        for (int i = 0; i < 5; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }*/
        ArrayList<Double> array = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < 5; i++) {
            if (console.hasNextDouble()) {
                double d = console.nextDouble();
                array.add(d);
            }
        }
        System.out.println("Элементы массива кратные 3:");
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 3 == 0) {
                System.out.println(array.get(i) + " ");
            }
        }
    }
}