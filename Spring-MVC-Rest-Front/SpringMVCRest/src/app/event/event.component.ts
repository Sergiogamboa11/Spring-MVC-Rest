import { Component, OnInit } from '@angular/core';
import {FormGroup, FormControl} from '@angular/forms';
import { EventService } from '../services/event.service';
import { HttpClient } from '@angular/common/http';
import { Event } from '../models/event.model';
import { Manager } from '../models/manager.model';

@Component({
  selector: 'app-event',
  templateUrl: './event.component.html',
  styleUrls: ['./event.component.css']
})
export class EventComponent implements OnInit {

  posts;

  eventsList;

  private event: Event = new Event();
  private manager: Manager = new Manager();

  constructor(private eventService: EventService) { }

  ngOnInit(): void {
    this.get();
  }

  ngOnChange(){

  }

  get(){
    this.eventService.get()
        .subscribe(response => {
          console.log(response);
          this.eventsList = response;
        });
  }

}
