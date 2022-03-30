package com.example.Project.serviceimp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Project.Entity.Employee;
import com.example.Project.exceptions.ResourceNotFoundException;
import com.example.Project.repository.EmployeeRepository;
import com.example.Project.service.EmployeeService;

@Service
public class ServiceImp implements EmployeeService 

{
	@Autowired
	private EmployeeRepository repository;
	List<Employee>list=new ArrayList<Employee>();

	public List<Employee> getall() {
		list=repository.findAll();
		return list;
	}
	public Employee add(Employee e) {
		repository.save(e);
		return e;
	}@Override
	public Optional<Employee> find(Long e) {
		return repository.findById(e);
		
	}
	@Override
	public void delete(Long id) {
		if(repository.getById(id)!=null)
		{
			repository.deleteById(id);
			System.out.println("ENTRY DELETED");
		}
		else
		{
			System.out.println("EMPLOYEE NOT FOUND");
		}
		
	}
	@Override
	public void update(Long id,Employee e) {
		if(repository.getById(id)!=null)
		{
			Employee employee = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee","ID",id));
			employee.setLname(e.getLname());
			employee.setMail(e.getMail());
			employee.setFname(e.getFname());
			repository.save(employee);
			System.out.println("UPDATED INFORMATION OF EMPLOYEE ");
		}
		else
		{
			System.out.println("EMPLOYEE WITH MENTIONED ID NOT FOUND");
		}
	}

}
