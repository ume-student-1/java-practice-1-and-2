import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();

        while (true) {
            System.out.println("1 - добавить задачу\n2 - удалить первую задачу\n3 - удалить задачу по номеру\n4 - показать все задачи\n5 - выход\nвыбери команду:");
            int command;

            if (scanner.hasNextInt()) {
                command = scanner.nextInt();
                scanner.nextLine();
            } else {
                scanner.nextLine();
                System.out.println("ответ неверный");
                continue;
            }

            switch (command) {
                case 1 -> {
                    System.out.print("кака я задача: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                }

                case 2 -> {
                    if (tasks.isEmpty()) {
                        System.out.println("список пуст");
                    } else {
                        tasks.remove(0);
                        System.out.println("первая задача удалена");
                    }
                }

                case 3 -> {
                    System.out.print("ВВЕДИ номер задачи1!: ");
                    if (!scanner.hasNextInt()) {
                        scanner.nextLine();
                        System.out.println("НОМЕР НЕ ВЕРНЫЙ!!1!!");
                        break;
                    }

                    int number = scanner.nextInt();
                    scanner.nextLine();

                    if (number < 1 || number > tasks.size()) {
                        System.out.println("ты охламон номер неверный");
                    } else {
                        tasks.remove(number - 1);
                        System.out.println("ззачда удалена");
                    }
                }

                case 4 -> {
                    if (tasks.isEmpty()) {
                        System.out.println("пусто как моя башка");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                }

                case 5 -> {
                    System.out.println("прога завершена");
                    scanner.close();
                    return;
                }

                default -> System.out.println("КОМАНДА НЕВЕРАН!11");
            }
        }
    }
}