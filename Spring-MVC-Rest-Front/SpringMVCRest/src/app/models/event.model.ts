import { Manager } from './manager.model'

export class Event{
    eventId: number
    name: string
    location: string
    date: string
    time: string
    manager: Manager
}