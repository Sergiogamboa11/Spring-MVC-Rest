import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { Event } from './models/event.model';
import { EventComponent } from './event/event.component';
import { CreateEventComponent } from './create-event/create-event.component';


const routes: Routes = [
  {path: 'events', component: EventComponent},
  {path: 'createevent', component: CreateEventComponent},
  {path: '', redirectTo:'events', pathMatch:'prefix'}, 
  {path: '**', redirectTo:'events', pathMatch:'prefix'}
 ];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
