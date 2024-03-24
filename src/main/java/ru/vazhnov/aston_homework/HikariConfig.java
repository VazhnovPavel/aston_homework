package ru.vazhnov.aston_homework;

import com.zaxxer.hikari.*;
public class HikariConfig extends com.zaxxer.hikari.HikariConfig {
    public static HikariDataSource createDataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/task2db");
        config.setUsername("admin");
        config.setPassword("admin");
        config.setMaximumPoolSize(10);
        return new HikariDataSource(config);
    }
}
