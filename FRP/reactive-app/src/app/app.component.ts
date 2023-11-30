import { Component,OnInit } from '@angular/core';
import {ToDo} from "./to-do";
import {ToDoService} from "./to-do.service";
import { fromEvent, Observable,interval } from 'rxjs';
import { throttle, mapTo, scan } from "rxjs/operators";
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'reactive-app';

  items:Array<ToDo> = [];
  clickObservable: Observable<Event> = fromEvent(document,'click');

  constructor(public todoService:ToDoService) {
    this.todoService.todos.subscribe(data=>{
      this.items = data;
    });
  }
  ngOnInit(): void {
    this.subscribeToObservable();
  }
  private subscribeToObservable() {
    let obs = this.clickObservable.pipe(mapTo(1))
                        .pipe(throttle(x => interval(1000)))
                        .pipe(scan((acc, one) => acc + one, 0));
    obs.subscribe( (value) => console.log(value));
  }
}
