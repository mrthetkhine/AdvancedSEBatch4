import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {HttpClientModule} from "@angular/common/http";
import { ToDoComponent } from './to-do/to-do.component';
import { ToDoCompletedCountComponent } from './to-do-completed-count/to-do-completed-count.component';

@NgModule({
  declarations: [
    AppComponent,
    ToDoComponent,
    ToDoCompletedCountComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
