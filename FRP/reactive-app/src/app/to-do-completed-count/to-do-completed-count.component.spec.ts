import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ToDoCompletedCountComponent } from './to-do-completed-count.component';

describe('ToDoCompletedCountComponent', () => {
  let component: ToDoCompletedCountComponent;
  let fixture: ComponentFixture<ToDoCompletedCountComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ToDoCompletedCountComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ToDoCompletedCountComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
