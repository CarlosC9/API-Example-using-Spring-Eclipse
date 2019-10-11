package com.carlos.taskapi.entity.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlos.taskapi.entity.dao.ITaskDao;
import com.carlos.taskapi.entity.models.Task;

@Service
public class TaskServiceImpl implements ITaskService {
	
	@Autowired
	private ITaskDao taskDao;

	@Override
	public List<Task> getAllTask() {
		return (List<Task>) taskDao.findAll();
	}

	@Override
	public void createTask(Task task) {
		taskDao.save(task);
	}

	@Override
	public List<Task> getAllTaskDependingState(String state) {
		
		List<Task> allTask = (List<Task>) taskDao.findAll();
		List<Task> returnTask = new ArrayList<Task>();
		
		for (Task task : allTask) {
			if (task.getState().equalsIgnoreCase(state)) {
				returnTask.add(task);
			}
		}
		
		return returnTask;
	}

	@Override
	public void deleteTask(long id) {
		this.taskDao.deleteById(id);
		
	}

	@Override
	public void uploadTask(Task task) {
		this.taskDao.save(task);
	}
	
}
