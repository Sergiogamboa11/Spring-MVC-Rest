package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Manager;

@Repository
public interface ManagerDao extends CrudRepository<Manager, Integer>{

	public List<Manager> findAll();
	public Manager findById(int id);
	public void deleteById(int id);
	
}
