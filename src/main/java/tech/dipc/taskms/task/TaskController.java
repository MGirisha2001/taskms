package tech.dipc.taskms.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
	@RestController
	public class TaskController {
		
		@Autowired
		TaskRepo repos;
		
		@GetMapping("/data")
		List<TaskEmployee> getEmployee(){
					
TaskEmployee e1=new TaskEmployee();
					
					e1.setEid(1);
					e1.setTaskName("Task Management System");
					e1.setCreator("Girisha");
					e1.setAssignedTo("John");
					e1.setProposedStartTime(10);
					e1.setActualStartTime(11);
					e1.setEstimatedTimeTaken(5);
					e1.setActualTimeTaken(6);
					
					
TaskEmployee e2=new TaskEmployee();
					
			e2.setEid(2);
			e2.setTaskName("Testing");
			e2.setCreator("Smith");
			e2.setAssignedTo("Andrew");
			e2.setProposedStartTime(3);
			e2.setActualStartTime(5);
			e2.setEstimatedTimeTaken(3);
			e2.setActualTimeTaken(5);
					
					
TaskEmployee e3=new TaskEmployee();
			
			e3.setEid(3);
			e3.setTaskName("Crud operation");
			e3.setCreator("Helen");
			e3.setAssignedTo("Saw");
			e3.setProposedStartTime(10);
			e3.setActualStartTime(11);
			e3.setEstimatedTimeTaken(5);
			e3.setActualTimeTaken(6);
					
TaskEmployee e4=new TaskEmployee();
			
			e4.setEid(4);
			e4.setTaskName("Command Line Runner");
			e4.setCreator("Nithya");
			e4.setAssignedTo("Nivya");
			e4.setProposedStartTime(5);
			e4.setActualStartTime(6);
			e4.setEstimatedTimeTaken(5);
			e4.setActualTimeTaken(3);
					
TaskEmployee e5=new TaskEmployee();
			e5.setEid(5);
			e5.setTaskName("Sql");
			e5.setCreator("Jyothi");
			e5.setAssignedTo("Priya");
			e5.setProposedStartTime(11);
			e5.setActualStartTime(12);
			e5.setEstimatedTimeTaken(3);
			e5.setActualTimeTaken(4);
					
					ArrayList<TaskEmployee> display= new ArrayList();
					display.add(e1);
					display.add(e2);
					display.add(e3);
					display.add(e4);
					display.add(e5);
					
					return display;

				
				}
		
		

		  @RequestMapping("/details")
		 
		 public List<TaskEmployee> getTask()
		 {
			 return repos.findAll();
		 }
		 
		@RequestMapping("/details/{eid}")
		 
		 
		 public Optional<TaskEmployee> getTask2(@PathVariable("eid") int eid) {
			 
			 return repos.findById(eid);
	}
		 
		
		 
		 @PostMapping("/postdetails")
		 public TaskEmployee getTask3(@RequestBody TaskEmployee emppost)
		 {
			
		 	repos.save(emppost);
		 	 return emppost;
		 	
		 	 
		 }

		 @DeleteMapping("/details/{eid}")
		 public TaskEmployee getTask4(@PathVariable("eid") int eid)
		 {
		 	TaskEmployee emp=repos.getOne(eid);
		 	repos.delete(emp);
		 	return emp;
		 }
		 
		 
		


		 @PutMapping(path="/putdetails" , consumes= {"application/json"} )

		 public TaskEmployee getTask5(@RequestBody TaskEmployee empput)
		 {
		 	
		 	repos.save(empput);
		 	return empput;
		 	
		 }

	}


