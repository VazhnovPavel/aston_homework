package ru.vazhnov.aston_homework.task1_JDBC;

import java.sql.SQLException;

public class UserOperations {

    public static void addUser(String nickname) {
        try {
            UserQuery.insertUser(nickname);
            System.out.println("Пользователь '" + nickname + "' успешно добавлен.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка при добавлении пользователя.");
        }
    }

    public static void deleteUser(String nickname) {
        try {
            // Реализуйте метод удаления пользователя по его nickname
            // UserQuery.deleteUser(nickname);
            System.out.println("Пользователь '" + nickname + "' успешно удален.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ошибка при удалении пользователя.");
        }
    }

    public static void updateUser(String oldNickname, String newNickname) {
        try {
            // Реализуйте метод обновления данных пользователя
            // UserQuery.updateUser(oldNickname, newNickname);
            System.out.println("Данные пользователя '" + oldNickname + "' успешно обновлены.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ошибка при обновлении данных пользователя.");
        }
    }

    public static void getUser(String nickname) {
        try {
            // Реализуйте метод получения данных пользователя
            // User user = UserQuery.getUser(nickname);
            // System.out.println("Данные пользователя '" + nickname + "': " + user);
            System.out.println("Данные пользователя '" + nickname + "': ...");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ошибка при получении данных пользователя.");
        }
    }
}

