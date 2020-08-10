package tech.dipc.taskms.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UserController {

	@Autowired
	UserRepo repo;

	@RequestMapping("/employee")

	public List<UserEmployee> getEmployees() {
		return repo.findAll();
	}

	@RequestMapping("/employee/{cid}")

	public Optional<UserEmployee> getEmployees2(@PathVariable("cid") int cid) {

		return repo.findById(cid);
	}

	@PostMapping("/postemployee")
	public UserEmployee getEmployee3(@RequestBody UserEmployee employee) {

		repo.save(employee);
		return employee;

	}

	@DeleteMapping("/employee/{cid}")
	public UserEmployee getCustomers4(@PathVariable("cid") int cid) {
		UserEmployee cust = repo.getOne(cid);
		repo.delete(cust);
		return cust;
	}

	@PutMapping(path = "/putemployee", consumes = { "application/json" })

	public UserEmployee getCustomers5(@RequestBody UserEmployee employee) {

		repo.save(employee);
		return employee;

	}

}
