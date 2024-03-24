package ru.vazhnov.aston_homework.task1_JDBC;


import java.sql.SQLException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите команду (ADD 'telegram_nickname', DELETE 'telegram_nickname', EXIT для выхода): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("EXIT")) {
                break;
            }

            String[] parts = input.split("\\s+", 2); // Разделяем ввод на команду и аргумент
            if (parts.length != 2) {
                System.out.println("Неправильный формат команды.");
                continue;
            }

            String command = parts[0];
            String nickname = parts[1].replace("'", ""); // Извлекаем telegram_nickname из аргумента

            try {
                switch (command.toUpperCase()) {
                    case "ADD":
                        UserQuery.insertUser(nickname);
                        System.out.println("Пользователь '" + nickname + "' успешно добавлен.");
                        break;
                    case "DELETE":
                        UserQuery.deleteUser(nickname);
                        break;
                    default:
                        System.out.println("Неизвестная команда.");
                        break;
                }
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Ошибка при выполнении команды.");
            }
        }

        scanner.close();
    }
}