package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Manager {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int managerId;
	
	@Column
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="manager_id")
	private List<Event> event;
	
	public Manager() {
	}

	public Manager(int managerId, String name, List<Event> event) {
		super();
		this.managerId = managerId;
		this.name = name;
		this.event = event;
	}
	
	public Manager(String name, List<Event> event) {
		super();
		this.name = name;
		this.event = event;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Event> getEvent() {
		return event;
	}

	public void setEvent(List<Event> event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", name=" + name + ", Event=" + event + "]";
	}
	
}
