package tech.dipc.taskms;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tech.dipc.taskms.task.TaskEmployee;
import tech.dipc.taskms.task.TaskRepo;
import tech.dipc.taskms.user.UserEmployee;
import tech.dipc.taskms.user.UserRepo;

@SpringBootApplication

public class DemoCommandLineRunner implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TaskmsApplication.class, args);
	}

	@Autowired
	private UserRepo repo;

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("Data Loaded by CommandLineRunner for Task.");
		System.out.println("Data Loaded by CommandLineRunner for User.");

		// User Command Line Runner

		UserEmployee emp1 = new UserEmployee();

		// emp1.setCid(1);
		emp1.setFirstname("Ronnie");
		emp1.setMiddlename("D.");
		emp1.setLastname("Anderson");
		emp1.setEmail("Ronnie@gmail.com");
		emp1.setPhonenum(987654321);
		emp1.setRole("Developer");

		UserEmployee emp2 = new UserEmployee();

		// emp2.setCid(2);
		emp2.setFirstname("John");
		emp2.setMiddlename("Andrew");
		emp2.setLastname("Brown");
		emp2.setEmail("John@gmail.com");
		emp2.setPhonenum(834509384);
		emp2.setRole("Tester");

		UserEmployee emp3 = new UserEmployee();

		// emp3.setCid(3);
		emp3.setFirstname("Ann");
		emp3.setMiddlename("Claire");
		emp3.setLastname("Brook");
		emp3.setEmail("Ann@gmail.com");
		emp3.setPhonenum(984312345);
		emp3.setRole("Developer");

		UserEmployee emp4 = new UserEmployee();

		// emp4.setCid(4);
		emp4.setFirstname("Frank");
		emp4.setMiddlename("Finn");
		emp4.setLastname("Hill");
		emp4.setEmail("Frank@gmail.com");
		emp4.setPhonenum(932267890);
		emp4.setRole("tester");

		UserEmployee emp5 = new UserEmployee();

		// emp5.setCid(5);
		emp5.setFirstname("Betty");
		emp5.setMiddlename("Grace");
		emp5.setLastname("Johnson");
		emp5.setEmail("Betty@gmail.com");
		emp5.setPhonenum(973212345);
		;
		emp5.setRole("Developer");

		// Task Command Line Runner

		TaskEmployee e1 = new TaskEmployee();

		e1.setEid(1);
		e1.setTaskName("Task Management System");
		e1.setCreator("Girisha");
		e1.setAssignedTo(1);
		e1.setProposedStartTime(10);
		e1.setActualStartTime(11);
		e1.setEstimatedTimeTaken(5);
		e1.setActualTimeTaken(6);

		TaskEmployee e2 = new TaskEmployee();

		e2.setEid(2);
		e2.setTaskName("Testing");
		e2.setCreator("Smith");
		e2.setAssignedTo(2);
		e2.setProposedStartTime(3);
		e2.setActualStartTime(5);
		e2.setEstimatedTimeTaken(3);
		e2.setActualTimeTaken(5);

		TaskEmployee e3 = new TaskEmployee();

		e3.setEid(3);
		e3.setTaskName("Crud operation");
		e3.setCreator("Helen");
		e3.setAssignedTo(3);
		e3.setProposedStartTime(10);
		e3.setActualStartTime(11);
		e3.setEstimatedTimeTaken(5);
		e3.setActualTimeTaken(6);

		TaskEmployee e4 = new TaskEmployee();

		e4.setEid(4);
		e4.setTaskName("Command Line Runner");
		e4.setCreator("Nithya");
		e4.setAssignedTo(4);
		e4.setProposedStartTime(5);
		e4.setActualStartTime(6);
		e4.setEstimatedTimeTaken(5);
		e4.setActualTimeTaken(3);

		TaskEmployee e5 = new TaskEmployee();
		e5.setEid(5);
		e5.setTaskName("Sql");
		e5.setCreator("Jyothi");
		e5.setAssignedTo(5);
		e5.setProposedStartTime(11);
		e5.setActualStartTime(12);
		e5.setEstimatedTimeTaken(3);
		e5.setActualTimeTaken(4);

		emp1.getTaskEmployee().add(e2);
		emp2.getTaskEmployee().add(e3);
		emp3.getTaskEmployee().add(e4);
		emp4.getTaskEmployee().add(e5);
		emp5.getTaskEmployee().add(e1);

		this.repo.save(emp1);
		this.repo.save(emp2);
		this.repo.save(emp3);
		this.repo.save(emp4);
		this.repo.save(emp5);

	}
}

