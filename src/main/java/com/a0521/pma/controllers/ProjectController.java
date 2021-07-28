package com.a0521.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.a0521.pma.dao.EmployeeRepository;
import com.a0521.pma.dao.ProjectRepository;
import com.a0521.pma.entity.Employee;
import com.a0521.pma.entity.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	@Autowired
	ProjectRepository proRepo;
	
	@Autowired
	EmployeeRepository empRepo;
	
	@GetMapping
	public String displayProjects(Model model) {
		List<Project> projects= proRepo.findAll();
		model.addAttribute("projectList",projects);
		return "projects/list-projects";
		
	}
	
//	@RequestMapping("/new")
	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		List<Employee>employees=empRepo.findAll();
		model.addAttribute("employeeList",employees);
		
		model.addAttribute("project",new Project());
		return "projects/new-project";
		
	}
	
//	@RequestMapping(value="/save",method=RequestMethod.POST)
	@PostMapping("/save")
	public String createProject(Project project, Model model) {
		proRepo.save(project);
		
//		Iterable<Employee>chosenEmployee=empRepo.findAllById(employees);
//		
//		for(Employee emp : chosenEmployee) {
//			emp.setProjectRel(project);
//			empRepo.save(emp);
//		}
		
		return "redirect:/projects";
	}

}
