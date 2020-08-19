package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Event;

@Repository
public interface EventDao extends JpaRepository<Event, Integer> {
	
	public List<Event> findAll();
	public Event findById(int id);
	public void deleteById(int id);
	
}
