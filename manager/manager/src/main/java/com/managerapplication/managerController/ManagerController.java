package com.managerapplication.managerController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.managerapplication.manager.model.Manager;
import com.managerapplication.manager.services.ManagerService;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Controller
@Transactional
public class ManagerController {
private ManagerService managerservice;
	
	@GetMapping("/registermanager")
	public String regimanager(Model model) {
		model.addAttribute("Manager", new Manager());
		return "managerRegister";
	}
	@PostMapping("/status")
	public String getStatus(@Valid @ModelAttribute("manager") Manager manager, BindingResult bindResult) {
		if(bindResult.hasErrors()) {
			return "managerRegister";
		}
		managerservice.saveRegistred(manager);
		 return "redirect:/managerLogin";
	}


}
