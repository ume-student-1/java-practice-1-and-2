import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int CURRENT_YEAR = 2026;

        int birthYear;

        while (true) {
            System.out.print("год рождения?! ау?!: ");
            birthYear = scanner.nextInt();

            if (birthYear <= CURRENT_YEAR) {
                break;
            }

            System.out.println("слыш ты доктор кто? ты из будущего или куда попер?!\nвводи нормально чучело");
        }

        int age = CURRENT_YEAR - birthYear;

        System.out.println("тебе " + age + " лет");

        if (age < 18) {
            System.out.println("ты еще малой, иди учись");
        } else if (age <= 65) {
            System.out.println("ты уже зрелый, но еще не старый");
        } else {
            System.out.println("ты уже старый, но еще не древний");
        }

        scanner.close();
    }
}