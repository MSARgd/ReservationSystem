import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PersonesEditComponent } from './persones-edit.component';

describe('PersonesEditComponent', () => {
  let component: PersonesEditComponent;
  let fixture: ComponentFixture<PersonesEditComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PersonesEditComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PersonesEditComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
