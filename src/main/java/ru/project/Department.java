package ru.project;

public class Department {
    long id;
    String name;

    public Department(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name + '\'' + '}';
    }
}
