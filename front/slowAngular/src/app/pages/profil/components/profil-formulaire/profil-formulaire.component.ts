import { Component, OnInit } from '@angular/core';
import { Form, FormArray, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Profil } from 'src/app/models/profil/profil.model';
@Component({
  selector: 'app-profil-formulaire',
  templateUrl: './profil-formulaire.component.html',
  styleUrls: ['./profil-formulaire.component.css']
})
export class ProfilFormulaireComponent implements OnInit {

  profils:Profil[] = [];
  submitted: boolean = false;
  constructor(private formBuilder: FormBuilder) { }

  ngOnInit(): void {
  }

  ProfilForm: FormGroup = this.formBuilder.group({
    pseudo: [''],
    photo_profil: [''],
    devise: ['']
    // On déclare ici un tableau de FormArray
    // Dans lequel on ajoute un control pour un téléphone
  } );

  public addProfil(): void {
    this.profils.push(this.ProfilForm.value);
    this.ProfilForm.reset();
    this.submitted = false;
  }

  public onSubmit(): void {
    this.submitted = true
    if (this.ProfilForm.valid) {
      this.addProfil();
    }
  }
  public get form() {
    return this.ProfilForm.controls;
  }
}
