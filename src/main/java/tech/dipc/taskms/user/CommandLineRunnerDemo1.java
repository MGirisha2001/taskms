package tech.dipc.taskms.user;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CommandLineRunnerDemo1 implements CommandLineRunner {
   public static void main(String[] args) {
      SpringApplication.run(CommandLineRunnerDemo1.class, args);
   }
   
   @Autowired
   private UserRepo repo;
   
   @Override
   public void run(String... arg0) throws Exception {
      System.out.println("Data Loaded by CommandLineRunner for User.");
      
      
    	  
    		UserEmployee emp1=new UserEmployee();
			
			emp1.setCid(1);
			emp1.setFirstname("Ronnie");
			emp1.setMiddlename("D.");
			emp1.setLastname("Anderson");
			emp1.setEmail("Ronnie@gmail.com");
			emp1.setPhonenum(987654321);
			emp1.setRole("Developer");
			
			
	UserEmployee emp2=new UserEmployee();
			
			emp2.setCid(2);
			emp2.setFirstname("John");
			emp2.setMiddlename("Andrew");
			emp2.setLastname("Brown");
			emp2.setEmail("John@gmail.com");
			emp2.setPhonenum(834509384);
			emp2.setRole("Tester");
			
			
	UserEmployee emp3=new UserEmployee();
	
			emp3.setCid(3);
			emp3.setFirstname("Ann");
			emp3.setMiddlename("Claire");
			emp3.setLastname("Brook");
			emp3.setEmail("Ann@gmail.com");
			emp3.setPhonenum(984312345);
			emp3.setRole("Developer");
			
	UserEmployee emp4=new UserEmployee();
	
			emp4.setCid(4);
			emp4.setFirstname("Frank");
			emp4.setMiddlename("Finn");
			emp4.setLastname("Hill");
			emp4.setEmail("Frank@gmail.com");
			emp4.setPhonenum(932267890);
			emp4.setRole("tester");
			
			
	UserEmployee emp5=new UserEmployee();
			
			emp5.setCid(5);
			emp5.setFirstname("Betty");
			emp5.setMiddlename("Grace");
			emp5.setLastname("Johnson");
			emp5.setEmail("Betty@gmail.com");
			emp5.setPhonenum(973212345);;
			emp5.setRole("Developer");
			
			ArrayList<UserEmployee> emp= new ArrayList();
			emp.add(emp1);
			emp.add(emp2);
			emp.add(emp3);
			emp.add(emp4);
			emp.add(emp5);
			
			repo.saveAll(emp);

		
		}
      }
    	  
      

