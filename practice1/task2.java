public class Task2 {
    public static void main(String[] args) {

        int[] numbers = {10, 15, 20, 7, 8, 13, 4, 21, 6, 9};

        System.out.println("элементы массива: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        int evenSum = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
            } else {
                oddCount++;
            }
        }

        System.out.println("сумма четных чисел: " + evenSum);
        System.out.println("количество нечетных чисел: " + oddCount);
    }
}