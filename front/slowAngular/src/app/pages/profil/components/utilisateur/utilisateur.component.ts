import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-utilisateur',
  templateUrl: './utilisateur.component.html',
  styleUrls: ['./utilisateur.component.css']
})
export class UtilisateurComponent implements OnInit {

  profilePicUrl: string = "https://cdn.eso.org/images/screen/eso1907a.jpg";
  pseudo: string = "Pseudo en dur dans le *.ts";
  devise: string = "Devise en dur dans le *.ts";

  constructor() { }

  ngOnInit(): void {
  }

  // Pour test. A supprimer à terme :
  l_parcours: any[] =
  [
    {
      nom: "Mon 1er Parcours",
      description: "Lille-Amsterdam",
      champ1: "champ1",
      champ2: "champ2"
    },
    {
      nom: "Le second Parcours",
      description: "Amiens-Bruxelles",
      champ1: "champ1",
      champ2: "champ2"
    }
  ];

}
