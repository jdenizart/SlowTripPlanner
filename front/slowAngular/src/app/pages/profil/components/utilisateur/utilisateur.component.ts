import { Component, OnInit } from '@angular/core';
import {Title} from "@angular/platform-browser";

@Component({
  selector: 'app-utilisateur',
  templateUrl: './utilisateur.component.html',
  styleUrls: ['./utilisateur.component.css']
})
export class UtilisateurComponent implements OnInit {

  profilePicUrl: string = "../assets/snail.png";
  pseudo: string = "Lesma";
  devise: string = "Ce n'est pas la destination qui compte, mais le voyage !";

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
      champ2: "champ2",
      imgUrl: "https://cdn.discordapp.com/attachments/1000052959654191154/1000053184796045422/jorge-luis-ojeda-flota-FqtgyYgBLyQ-unsplash.jpg"
    },
    {
      nom: "Découverte Belgique",
      description: "Amiens-Bruxelles",
      champ1: "champ1",
      champ2: "champ2",
      imgUrl: "https://cdn.discordapp.com/attachments/1000052959654191154/1000053184045252688/jakob-owens-CiUR8zISX60-unsplash.jpg"
    }
  ];

}
