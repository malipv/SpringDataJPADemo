package ru.project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO {
    Connection con;
    Department findbyId(){
        return null;
    }
    List<Department> findbyName(){
        return null;
    }
/*
    void addDepartment(Department dep) {
    }
 */
    public List<Department> findAll() throws Exception {
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT id, name FROM department");
        List<Department> departments = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            departments.add(new Department(id, name));

        }
        return departments;
    }
}
