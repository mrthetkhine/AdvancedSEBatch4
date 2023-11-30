import { Component } from '@angular/core';
import {ToDo} from "../to-do";
import {ToDoService} from "../to-do.service";

@Component({
  selector: 'app-to-do-completed-count',
  templateUrl: './to-do-completed-count.component.html',
  styleUrls: ['./to-do-completed-count.component.scss']
})
export class ToDoCompletedCountComponent {
  items: Array<ToDo> =[];

  constructor(private todoService:ToDoService) {
    this.todoService.todos.subscribe(data=>{
      this.items = data.filter((todo:ToDo)=> todo.completed )
    });
  }
}
