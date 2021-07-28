package com.a0521.pma;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.a0521.pma.dao.EmployeeRepository;
import com.a0521.pma.dao.ProjectRepository;
import com.a0521.pma.entity.Project;
import com.a0521.pma.entity.Employee;

@SpringBootApplication
//public class projectManagementApplication implements CommandLineRunner{
public class ProjectManagementApplication{
	@Autowired
	EmployeeRepository empRepo;
	
	@Autowired
	ProjectRepository proRepo;

	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementApplication.class, args);
	}
	
//	@Override
//	public void run(String... args)throws Exception{
//		Employee emp1 = new Employee("Hoge1","Hoge1","hogehoge1@hoge.com");
//		Employee emp2 = new Employee("Hoge2","Hoge2","hogehoge2@hoge.com");
//		Employee emp3 = new Employee("Hoge3","Hoge3","hogehoge3@hoge.com");
//		
//		Project pro1 = new Project("Project hoge hoge 1","NOTSTARTED","description 1");
//		Project pro2 = new Project("Project hoge hoge 2","NOTSTARTED","description 2");
//		Project pro3 = new Project("Project hoge hoge 3","NOTSTARTED","description 3");
//		
//		pro1.addEmployee(emp1);
//		pro1.addEmployee(emp2);
//		pro2.addEmployee(emp1);
//		pro2.addEmployee(emp3);
//		pro3.addEmployee(emp2);
//		pro3.addEmployee(emp3);
//		
//		emp1.setProjectRels(Arrays.asList(pro1,pro2,pro3));
//		emp2.setProjectRels(Arrays.asList(pro1,pro3));
//		emp3.setProjectRels(Arrays.asList(pro3));
//		
//		empRepo.save(emp1);
//		empRepo.save(emp2);
//		empRepo.save(emp3);
//		
//		proRepo.save(pro1);
//		proRepo.save(pro2);
//		proRepo.save(pro3);
//	}

}
