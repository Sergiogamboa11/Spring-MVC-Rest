package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Event;
import com.example.demo.services.EventService;
import com.example.demo.services.ManagerService;

@RestController
@RequestMapping("/api/events")
@CrossOrigin
public class EventController {

	
	@Autowired
	public EventService eventService;
	
	@Autowired
	public ManagerService managerService;
	
	@GetMapping
	public @ResponseBody List<Event> findAll() {
		return eventService.findAll();
	}
	
	@GetMapping("/{id}")
	public @ResponseBody Event postEvent(@PathVariable(value = "id") int id) {
		return eventService.findById(id);
	}
	
	@PostMapping
	public @ResponseBody Event postEvents(@RequestBody Event event) {
		
//		System.out.println(event.toString());
//		System.out.println(event.getManager().toString());
		if(event.getManager() != null) {
//			System.out.println(event.getManager().getManagerId());
			event.setManager(managerService.findById(event.getManager().getManagerId()));
//			System.out.println(event.toString());
		}
		return eventService.save(event);
	}
	
	@PutMapping("/{id}")
	public @ResponseBody Event putEvent(@RequestBody Event event) {
		return eventService.save(event);
	}
	
	
}
