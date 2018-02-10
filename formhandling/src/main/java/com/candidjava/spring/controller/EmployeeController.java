package com.candidjava.spring.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.candidjava.spring.bean.Employee;
import com.candidjava.spring.exception.GlobalExceptionHandler;

@Controller

public class EmployeeController {
	
	Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	Employee Employees = new Employee();
	static List<Employee> staticList=new ArrayList<>();
	
	
	
	@GetMapping("index")
	public ModelAndView register(Employee Employee) {
		System.out.println("ok");
		staticList.add(Employees);
		System.out.println(staticList);
		logger.info(Employees.toString());
		if(Employee==null)
		{
			System.out.println("nulllllllll");
			throw new RuntimeException("erroro");
		}
		return new ModelAndView("register");
	}

	
	@PostMapping("/register")
	
	public ModelAndView create( Employee employee) throws Exception {
		ModelAndView model = new ModelAndView("view");
		//System.out.println("hiiiiiiiii");
		String currUname=employee.getUsername();
		System.out.println("userName is"+currUname);
		Employees.setFirstname(employee.getFirstname());
		Employees.setLastname(employee.getLastname());
		Employees.setUsername(employee.getUsername());
		Employees.setPassword(employee.getPassword());
		Employees.setEmail(employee.getEmail());
		Employees.setCountry(employee.getCountry());
		Employees.setPhone(employee.getPhone());
		
		
		if(employee.getFirstname().contains("0")) {
			throw new Exception();
		}
		
			
		
		
		return model;
	}

	/*@GetMapping("/register")
	public ModelAndView viewData(Employee Employee) {

		ModelAndView model = new ModelAndView("register");
		//staticList.add(Employees);
		System.out.println("areee you upppppp");
		//logger.info(Employees.toString());
		return model;
	}*/

}

