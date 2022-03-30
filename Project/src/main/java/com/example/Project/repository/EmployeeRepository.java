package com.example.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
