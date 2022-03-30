package com.example.Project.controller;
import com.example.Project.Entity.*;
import com.example.Project.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class EmployeeController 
{	
	@Autowired
	private EmployeeService service;
	@GetMapping("/information")
	public List<Employee> getall()
	{
		return service.getall();
	}
	@PostMapping("/information")
	public Employee add(@RequestBody Employee e)
	{
		e.setFname(e.getFname().toUpperCase());
		e.setLname(e.getLname().toUpperCase());
		return service.add(e);
	}
	@GetMapping("/information/{id}")
	public Optional<Employee> findbyId(@PathVariable Long id)
	{
		return service.find(id);
	}
	@DeleteMapping("/information/{id}")
	public void delete(@PathVariable Long id)
	{
		service.delete(id);
	}
	@PutMapping("/information/{id}")
	public void updateemp(@PathVariable Long id,@RequestBody Employee e)
	{
		service.update(id,e);
	}
	
	
}
