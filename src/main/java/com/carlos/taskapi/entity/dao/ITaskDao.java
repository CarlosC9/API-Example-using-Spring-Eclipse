package com.carlos.taskapi.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.carlos.taskapi.entity.models.Task;


public interface ITaskDao extends CrudRepository<Task, Long> {

}
