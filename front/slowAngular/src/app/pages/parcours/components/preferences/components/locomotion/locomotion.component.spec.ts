import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LocomotionComponent } from './locomotion.component';

describe('LocomotionComponent', () => {
  let component: LocomotionComponent;
  let fixture: ComponentFixture<LocomotionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LocomotionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LocomotionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
