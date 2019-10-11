package com.carlos.taskapi.entity.services;

import java.util.List;

import com.carlos.taskapi.entity.models.Task;

public interface ITaskService {

	public List<Task> getAllTask();
	
	public void createTask(Task task);
	
	public void deleteTask(long id);
	
	public void uploadTask(Task task);
	
	public List<Task> getAllTaskDependingState(String state);
}
