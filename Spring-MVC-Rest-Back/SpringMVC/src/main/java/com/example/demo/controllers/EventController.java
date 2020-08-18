package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Event;
import com.example.demo.services.EventService;

@RestController
@RequestMapping("/api/events")
@CrossOrigin
public class EventController {

	
	@Autowired
	public EventService eventService;
	
	@GetMapping
	public @ResponseBody List<Event> findAll() {
		return eventService.findAll();
	}
	
	@PostMapping
	public @ResponseBody Event postEvent(@RequestBody Event event) {
		return eventService.save(event);
	}
	
}
