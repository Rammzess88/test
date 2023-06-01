import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3(getArray());
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        String value = scanner.nextLine();
        if (Integer.parseInt(value) > 7) {
            System.out.println("Привет");
        }
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String value = scanner.nextLine();
        if (value.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public static void task3(int[] arrayNumbers) {
        System.out.println("Элементы массива, кратные 3:");
        for (int numbers : arrayNumbers) {
            if (numbers % 3 == 0) {
                System.out.println(numbers);
            }
        }
    }

    public static int[] getArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите сами элементы:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }
}