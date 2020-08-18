package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Event;

@Repository
public interface EventDao extends CrudRepository<Event, Integer> {
	
	public List<Event> findAll();
	public Event findById(int id);
	public void deleteById(int id);
	
}
