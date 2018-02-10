package com.candidjava.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.candidjava.spring.bean.Employee;
import com.candidjava.spring.validator.EmployeeFormVaidator;





@Controller
public class EmployeeController {
	private final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	/*@Autowired
	EmployeeFormVaidator empFormValidator;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(empFormValidator);
	}*/

	@RequestMapping(value = "/users/add", method = RequestMethod.POST)
	public String showAddUserForm(@ModelAttribute Employee employee) {

		logger.debug("showAddUserForm()");

		Employee Employees = new Employee();
		Employees.setFirstname(employee.getFirstname());
		Employees.setLastname(employee.getLastname());
		Employees.setUsername(employee.getUsername());
		Employees.setPassword(employee.getPassword());
		Employees.setEmail(employee.getEmail());
		Employees.setCountry(employee.getCountry());
		Employees.setPhone(employee.getPhone());

		
		return "view";

	}
	
	@RequestMapping(value = "/users/register", method = RequestMethod.GET)
	public String register(Employee Employee) {
		System.out.println("ppppp");
		return "register";
	}


	/*Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	Employee Employees = new Employee();
	static List<Employee> staticList=new ArrayList<>();
	*/
/*	@RequestMapping(value = "/hello.htm")
	public String hello() throws IOException {
		
		// render hello.jsp page
		return "hello";
	}
	
	@GetMapping("index")
	public ModelAndView register(Employee Employee) {
		System.out.println("ok");
		staticList.add(Employees);
		System.out.println(staticList);
		logger.info(Employees.toString());
		return new ModelAndView("register");
	}

	@PostMapping("/register")
	public ModelAndView create( Employee employee) {
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
		
		
		logger.info(Employees.toString());
		System.out.println("adding to static list");
		staticList.add(Employees);
		System.out.println(staticList.size());
		for(Employee e:staticList)
		{
			if(staticList.size()==1)
			{
				System.out.println("do nothing");
			}
			else
			{
				if(currUname.equalsIgnoreCase(e.getUsername()))
					throw new RuntimeException();
			}
			
			
		}
		
		return model;
	}

	@GetMapping("/register")
	public ModelAndView viewData(Employee Employee) {

		ModelAndView model = new ModelAndView("register");
		//staticList.add(Employees);
		System.out.println("areee you upppppp");
		//logger.info(Employees.toString());
		return model;
	}*/

}

