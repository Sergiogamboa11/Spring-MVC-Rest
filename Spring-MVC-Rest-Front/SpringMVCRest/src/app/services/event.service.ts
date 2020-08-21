import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EventService {

  private url = "http://localhost:9025/api/events";

  constructor(private httpClient: HttpClient) { }

  get(){
    return this.httpClient.get(this.url);
  }

  post(payload){
    return this.httpClient.post(this.url, payload);
  }
}
