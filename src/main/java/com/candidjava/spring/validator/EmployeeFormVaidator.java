package com.candidjava.spring.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.candidjava.spring.bean.Employee;

public class EmployeeFormVaidator implements Validator {

	@Autowired
	@Qualifier("emailValidator")
	EmailValidator emailValidator;
	
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Employee.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		Employee employee = (Employee) target;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstname", "NotEmpty.employeeForm.firstname");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastname", "NotEmpty.employeeForm.lastname");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty.employeeForm.username");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty.employeeForm.password");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty.employeeForm.email");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phone", "NotEmpty.employeeForm.phone");

		if(!emailValidator.valid(employee.getEmail())){
			errors.rejectValue("email", "Pattern.employeeForm.email");
		}
		
		if(employee.getPhone()==null || employee.getPhone().length()<=0){
			errors.rejectValue("number", "Invalid.employeeForm.number");
		}
		
		if(employee.getUsername()==null){
			errors.rejectValue("username", "Invalid.employeeForm.username");
		}
		
		
		if(employee.getFirstname()==null){
			errors.rejectValue("firstName", "Invalid.employeeForm.firstname");
		}
		if(employee.getLastname()==null){
			errors.rejectValue("lastname", "Invalid.employeeForm.lastname");
		}
		
		

	}

}