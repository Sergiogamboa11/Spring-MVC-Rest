package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Manager;
import com.example.demo.repository.ManagerDao;

@Service
public class ManagerService {
	
	@Autowired
	public ManagerDao managerDao;
	
	public List<Manager> findAll(){
		return managerDao.findAll();
	}
	
	public Manager findById(int id) {
		return managerDao.findById(id);
	}
	
	public Manager save(Manager manager) {
		return managerDao.save(manager);
	}
	
	public void deleteById(int id) {
		managerDao.deleteById(id);
	}
}
