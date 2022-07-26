import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfilFormulaireComponent } from './profil-formulaire.component';

describe('ProfilFormulaireComponent', () => {
  let component: ProfilFormulaireComponent;
  let fixture: ComponentFixture<ProfilFormulaireComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProfilFormulaireComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProfilFormulaireComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
