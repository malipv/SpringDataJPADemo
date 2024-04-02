package ru.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Starter {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:h2:D:\\programming\\Projects\\Office");
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT id, name FROM department");
        List<Department> departments = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            departments.add(new Department(id, name));
        }
        departments.forEach(System.out::println);
    }
}
