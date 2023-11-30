import {Component, Input} from '@angular/core';
import {ToDo} from "../to-do";
import {ToDoService} from "../to-do.service";

@Component({
  selector: 'app-to-do',
  templateUrl: './to-do.component.html',
  styleUrls: ['./to-do.component.scss']
})
export class ToDoComponent {
  @Input() todo?:ToDo;

  constructor(private todoService: ToDoService) {
  }
  deleteTodo(todo?:ToDo)
  {
    console.log('Delete todo ',todo);
    this.todoService.deleteToDo({
      ...todo
    });
  }
}
