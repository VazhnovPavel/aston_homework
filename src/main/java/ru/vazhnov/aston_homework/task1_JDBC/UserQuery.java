package ru.vazhnov.aston_homework.task1_JDBC;

import ru.vazhnov.aston_homework.HikariConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserQuery {


    public static void insertUser(String nickname) throws SQLException {
        // Получаем соединение с базой данных с помощью HikariCP
        try (Connection connection = HikariConfig.createDataSource().getConnection()) {
            // Создаем запрос на вставку нового пользователя
            String query = "INSERT INTO users (telegram_nickname) VALUES (?)";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                // Устанавливаем значение параметра для nickname
                statement.setString(1, nickname);
                // Выполняем запрос на вставку
                statement.executeUpdate();
            }
        }
    }
    public static void deleteUser(String nickname) throws SQLException {
        // Получаем соединение с базой данных с помощью HikariCP
        try (Connection connection = HikariConfig.createDataSource().getConnection()) {
            // Создаем запрос на удаление пользователя
            String query = "DELETE FROM users WHERE telegram_nickname = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                // Устанавливаем значение параметра для nickname
                statement.setString(1, nickname);
                // Выполняем запрос на удаление
                int rowsDeleted = statement.executeUpdate();
                // Проверяем, были ли удалены строки
                if (rowsDeleted > 0) {
                    System.out.println("Пользователь '" + nickname + "' успешно удален.");
                } else {
                    System.out.println("Пользователь '" + nickname + "' не найден.");
                }
            }
        }
    }
}
