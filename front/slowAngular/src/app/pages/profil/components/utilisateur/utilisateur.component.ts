import { Component, OnInit } from '@angular/core';
<<<<<<< HEAD
import { Profil } from 'src/app/models/profil/profil.model';
import { ProfilService } from 'src/app/services/profil/profil.service';
=======
import {Title} from "@angular/platform-browser";
>>>>>>> dev

@Component({
  selector: 'app-utilisateur',
  templateUrl: './utilisateur.component.html',
  styleUrls: ['./utilisateur.component.css']
})
export class UtilisateurComponent implements OnInit {

  profilePicUrl: string = "https://www.mariderm.com/wp-content/uploads/2018/12/visage-tonus-after.jpg";
  pseudo: string = "Pseudo en dur";
  devise: string = "Devise en dur";

<<<<<<< HEAD
  profils: Profil[] = [];
  constructor(private profilService:ProfilService) { }
=======
  constructor(private titleService:Title) {
    this.titleService.setTitle("Slow - profil");
  }
>>>>>>> dev

  ngOnInit(): void {
  }

  onGetProfils(){
    this.profilService.getProfils()
    .subscribe(data=>{
      this.profils=data;
    })
  }
  
  
}
