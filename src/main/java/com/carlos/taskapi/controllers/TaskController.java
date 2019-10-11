package com.carlos.taskapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carlos.taskapi.entity.models.Task;
import com.carlos.taskapi.entity.services.ITaskService;


@RestController
@CrossOrigin(origins ="*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class TaskController {

	@Autowired
	private ITaskService taskService;
	
	@GetMapping("/allTask")
	public List<Task> getAllTask() {
		return taskService.getAllTask();
	}
	
	@GetMapping("/allTask/{state}")
	public List<Task> getAllTaskDependingState(@PathVariable(value = "state") String state) {
		return taskService.getAllTaskDependingState(state);
	}
	
	@PostMapping("/createTask")
	public void createTask(Task task) {
		taskService.createTask(task);
	}
	
	@PutMapping("/uploadTask")
	public void uploadTask(Task task) {
		taskService.uploadTask(task);
	}
	
	@DeleteMapping("/deleteTask")
	public void deleteTask(@RequestParam("id") long id) {
		taskService.deleteTask(id);
	}
}
