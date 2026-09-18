import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean guessed = false;

        System.out.println("угадай число от 1 до 100\nне разгадаешь 10 раз я тебе систему32 удалю к чертям собачим");

        while (!guessed && attempts < 10) {
            System.out.print("введи число: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("поздравляю! ты угадал число!");
                guessed = true;
            } else if (guess < secretNumber) {
                System.out.println("загаданное число больше");
            } else {
                System.out.println("загаданное число меньше");
            }
        }

        if (!guessed) {
            System.out.println("ты не угадал число. загаданное число было: " + secretNumber + "\nлох");
        }

        scanner.close();
    }
}