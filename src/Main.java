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
        if (console.hasNextInt()) {
            int number = console.nextInt();
            if (number > 7) {
                System.out.println("Привет");
            }
        } else {
            System.out.println("Вы ввели не число! Повторите попытку.");
        }
        console.close();
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
        console.close();
    }

    public static void task3() {
        Scanner console = new Scanner(System.in);
        int n;
        System.out.println("Введите размер массива: ");
        if (console.hasNextInt()) {
            n = console.nextInt();
        } else {
            System.out.println("Вы ввели не число!");
            return;
        }
        System.out.println("Введите элементы массива: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            if (console.hasNextInt()) {
                array[i] = console.nextInt();
            }
        }
        console.close();
        System.out.println("Элементы массива кратные 3:");
        for (int i = 0; i < n; i++) {
            if (array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}