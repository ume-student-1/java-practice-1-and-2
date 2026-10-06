
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    static int[] add(int[] numbers, int newNumber) {
        int[] newArray = new int[numbers.length + 1];

        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }

        newArray[newArray.length - 1] = newNumber;
        numbers = newArray;
        return numbers;
    }

    static int[] remove(int[] numbers, int indexToRemove) {
        if (indexToRemove < 0 || indexToRemove >= numbers.length) {
            System.out.println("неверный индекс");
            return numbers;
        }

        int[] newArray = new int[numbers.length - 1];

        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (i != indexToRemove) {
                newArray[j++] = numbers[i];
            }
        }

        numbers = newArray;
        return numbers;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};
        while (true) {

            System.out.println("элементы массива: " + Arrays.toString(numbers));

            System.out.println("выберите действие:");
            System.out.println("1 добавить элемент");
            System.out.println("2 удалить элемент");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("введи целое число для добавления: ");
                    int newNumber = scanner.nextInt();

                    numbers = add(numbers, newNumber);
                    System.out.println("элемент добавлен. новый массив: " + Arrays.toString(numbers));
                }
                case 2 -> {
                    System.out.print("введи индекс элемента для удаления (0-" + (numbers.length - 1) + "): ");
                    int indexToRemove = scanner.nextInt();

                    if (indexToRemove < 0 || indexToRemove >= numbers.length) {
                        System.out.println("неверный индекс");
                        return;
                    }

                    numbers = remove(numbers, indexToRemove);
                    System.out.println("элемент удален. новый массив: " + Arrays.toString(numbers));
                }
                default ->
                    System.out.println("неверный выбор");
            }

        }
    }
}
