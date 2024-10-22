package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeRepo;
import com.example.demo.entity.Employee;

//import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	private EmployeeRepo employeeRepo;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepo theEmployeeRepo)
	{
		employeeRepo = theEmployeeRepo;
	}
	
	@Override
	public List<Employee> findAll() {
		
		return employeeRepo.findAll();
	}

	@Override
	public Employee findById(int theId) {
		Optional<Employee> result = employeeRepo.findById(theId);
		
		Employee theEmployee = null;
		if(result.isPresent())
		{
			theEmployee = result.get();
		}
		else
		{
			throw new RuntimeException("Did not find employee id -" + theId);
		}
		return theEmployee;
		//return employeeRepo.findById(theId);
	}

//	@Transactional
	@Override
	public Employee save(Employee theEmployee) {
		
		return employeeRepo.save(theEmployee);
	}

//	@Transactional
	@Override
	public void deleteById(int theId) {
		employeeRepo.deleteById(theId);
		
	}
	
	

	
}
