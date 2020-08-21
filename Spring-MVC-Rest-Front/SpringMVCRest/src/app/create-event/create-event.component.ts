import { Component, OnInit } from '@angular/core';
import { Manager } from '../models/manager.model';
import { Event } from '../models/event.model';
import { FormGroup, FormControl } from '@angular/forms';
import { EventService } from '../services/event.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-event',
  templateUrl: './create-event.component.html',
  styleUrls: ['./create-event.component.css']
})
export class CreateEventComponent implements OnInit {

  private event: Event = new Event();
  private manager: Manager = new Manager();

  eventForm = new FormGroup({
    eventName: new FormControl(''),
    eventDate: new FormControl(''),
    eventLocation: new FormControl('')
  });

  constructor(private eventService: EventService, private router: Router) { }

  ngOnInit(): void {
  }

  createEvent(){

    this.manager.managerId = 1; //this is just handcoded for now
    
    this.event.name = this.eventForm.get("eventName").value;
    this.event.date = this.eventForm.get("eventDate").value;
    this.event.location = this.eventForm.get("eventLocation").value;
    this.event.manager = this.manager;

    this.eventService.post(this.event)
      .subscribe(response => {
        // console.log(response);
        this.router.navigateByUrl("/events");
      });
  }

}
