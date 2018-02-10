package com.candidjava.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.candidjava.spring.bean.Employee;







@Controller
@RequestMapping("/hello")
public class EmployeeController {
	private final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	/*@Autowired
	EmployeeFormVaidator empFormValidator;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(empFormValidator);
	}*/

	@RequestMapping(value = "/register", method = RequestMethod.POST)
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
	
	/*@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(ModelMap model, HttpServletRequest request) {
        String message = "Hello World, Spring 3.0!";
        System.out.println(message);
        //model.addAttribute("message", message);
        return "hello";
	}*/

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView hiWorld(){
        ModelAndView model = new ModelAndView("show");
        String message = "Hello World, Spring 3.0!";
        System.out.println(message);
        //model.addObject("welcomeMessage","Hello World");
        return model;   
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

