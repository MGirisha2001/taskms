package tech.dipc.taskms.task;

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

import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TaskController {

	@Autowired
	TaskRepo repos;

	@GetMapping("/details")

	public List<TaskEmployee> getTask() {
		return repos.findAll();
	}

	@GetMapping("/details/{eid}")

	public Optional<TaskEmployee> getTask2(@PathVariable("eid") int eid) {

		return repos.findById(eid);
	}

	@PostMapping("/postdetails")

	public TaskEmployee getTask3(@RequestBody TaskEmployee emppost) {

		repos.save(emppost);
		return emppost;

	}

	@DeleteMapping("/details/{eid}")
	public TaskEmployee getTask4(@PathVariable("eid") int eid) {
		TaskEmployee emp = repos.getOne(eid);
		repos.delete(emp);
		return emp;
	}

	@PutMapping(path = "/putdetails", consumes = { "application/json" })

	public TaskEmployee getTask5(@RequestBody TaskEmployee empput) {

		repos.save(empput);
		return empput;

	}

}
