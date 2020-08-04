package tech.dipc.taskms.task;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CommandLineRunnerDemo implements CommandLineRunner {
   public static void main(String[] args) {
      SpringApplication.run(CommandLineRunnerDemo.class, args);
   }
   
   @Autowired
   private TaskRepo repos;
   
   @Override
   public void run(String... arg0) throws Exception {
      System.out.println("Data Loaded by CommandLineRunner for Task.");
      
      
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
		
		repos.saveAll(display);
		
  }
   }

   