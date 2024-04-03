package ru.project;


//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;

//@Entity
public class Department {
    //@Id
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
