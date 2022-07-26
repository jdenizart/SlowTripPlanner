import { Component, OnInit } from '@angular/core';
import {Title} from "@angular/platform-browser";

@Component({
  selector: 'app-utilisateur',
  templateUrl: './utilisateur.component.html',
  styleUrls: ['./utilisateur.component.css']
})
export class UtilisateurComponent implements OnInit {

  profilePicUrl: string = "https://www.mariderm.com/wp-content/uploads/2018/12/visage-tonus-after.jpg";
  pseudo: string = "Pseudo en dur";
  devise: string = "Devise en dur";

  constructor(private titleService:Title) {
    this.titleService.setTitle("Slow - profil");
  }

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
