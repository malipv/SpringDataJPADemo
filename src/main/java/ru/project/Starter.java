package ru.project;

import org.h2.jdbcx.JdbcDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(scanBasePackages = "ru.project")

public class Starter {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = SpringApplication.run(Starter.class);
        DataSource ds = ctx.getBean(DataSource.class);
        System.out.println(ds);
    }
}

@Configuration
class DBConfig {
    @Bean
    public DataSource dataSource() {
        JdbcDataSource ds = new JdbcDataSource();
        ds.setUrl("jdbc:h2:D:\\programming\\Projects\\Office");
        return ds;
    }
}
