package com.example.Project.service;

import java.util.List;
import java.util.Optional;

import com.example.Project.Entity.Employee;

public interface EmployeeService
{
	public List<Employee>getall();
	public Employee add(Employee e);
	public Optional<Employee>find(Long e);
	public void delete(Long id);
	public void update(Long id, Employee e);
	public List<Employee> printbyname(String firstname);

}
