import { Injectable } from '@angular/core';
import {ToDo} from "./to-do";
import {HttpClient} from "@angular/common/http";
import {BehaviorSubject, Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ToDoService {
  private toDoData : Array<ToDo> = [];
  private _todos: BehaviorSubject<Array<ToDo>> = new BehaviorSubject<Array<ToDo>>([]);

  public readonly todos: Observable<Array<ToDo>> = this._todos.asObservable();

  constructor(private http:HttpClient) {
    this.loadAllToDo();
  }
  loadAllToDo()
  {
    return this.http.get<Array<ToDo>>('https://jsonplaceholder.typicode.com/todos/')
      .subscribe(data=>{
        this.toDoData = data;
        this._todos.next(this.toDoData);
      });
  }
  deleteToDo(todo:ToDo)
  {
    this.toDoData = this.toDoData.filter(item=> item.id != todo.id);
    this._todos.next(this.toDoData);
  }
}
