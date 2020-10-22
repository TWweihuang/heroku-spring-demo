package com.thoughtworks.springbootemployee.repository;

import com.thoughtworks.springbootemployee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findByGender(String gender);

    @Query("select new Employee(id, name,age,gender,salary) from Employee where gender=:gender and name=:name")
    List<Employee> retrieveEmployeesFromGender(@Param("gender") String anotherGender,@Param("name") String name);
}
