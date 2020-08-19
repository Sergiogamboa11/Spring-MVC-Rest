package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Event;
import com.example.demo.repository.EventDao;

@Service
public class EventService {

	@Autowired
	public EventDao eventDao;
	
	public Event save(Event event) {
		return eventDao.save(event);
	}
	
	public List<Event> findAll() {
		return eventDao.findAll();
	}
	
	public Event findById(int id) {
		return eventDao.findById(id);
	}
	
	public void deleteById(int id) {
		eventDao.deleteById(id);
	}
	
	public boolean existsById(int id) {
		return eventDao.existsById(id);
	}
	
}
