package com.FinalPracticalExam.Employee.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.FinalPracticalExam.Employee.model.Employee;
import com.FinalPracticalExam.Employee.services.EmployeeService;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
@Controller
@Transactional
public class EmployeeController {
private EmployeeService employeeservice;
	
	@GetMapping("/register")
	public String regiemployee(Model model) {
		model.addAttribute("employee", new Employee());
		return "employeeRegister";
	}
	@PostMapping("/status")
	public String getStatus(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindResult) {
		if(bindResult.hasErrors()) {
			return "employeeRegister";
		}
		employeeservice.saveRegistred(employee);
		 return "redirect:/employeeLogin";
	}


}
