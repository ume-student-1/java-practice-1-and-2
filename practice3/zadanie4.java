import java.util.*;

public class zadanie4 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(
                List.of(4, 2, 7, 2, 9, 4, 1, 7, 3, 9)
        );

        System.out.println("исходгая сосиска: " + numbers);

        List<Integer> unique = new ArrayList<>();

        for (int number : numbers) {
            if (!unique.contains(number)) {
                unique.add(number);
            }
        }

        System.out.println("уникальные эелементы: " + unique);

        System.out.println("коклво повторений:");

        for (int number : unique) {
            int count = 0;

            for (int value : numbers) {
                if (number == value) {
                    count++;
                }
            }

            System.out.println(number + " - " + count + " раза");
        }

        int min = numbers.get(0);
        int max = numbers.get(0);

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        System.out.println("мин: " + min);
        System.out.println("макс: " + max);

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.size();

        System.out.println("су ммма: " + sum);
        System.out.println("среднее ариф. у меня дизлексия: " + average);
    }
}