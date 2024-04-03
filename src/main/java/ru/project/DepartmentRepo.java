package ru.project;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepo extends CrudRepository<Department, Long> {
    //List<Department> findAllByName(String name);
    List<Department> findAllByNameStartsWithIgnoreCase(String name);

    @Query("select * from Department d where d.name = ?1")
    List<Department> find1123(String name);

    //возвращаемые типы
    //https://docs.spring.io/spring-data/jpa/reference/repositories/query-return-types-reference.html

    //Iterable<Department> find1123(String name);
}
