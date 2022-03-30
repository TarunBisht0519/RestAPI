package com.example.Project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Project.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> 
{
	@Query(value = "SELECT * FROM Employeeinfo WHERE First_Name = :firstName", nativeQuery = true)
    List<Employee> getbyfirstname(@Param("firstName") String firstName);
}
