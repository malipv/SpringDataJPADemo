package ru.project;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department {
    @Id
    long id;
    String name;

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name + '\'' + '}';
    }
}
