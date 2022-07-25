import { Component, OnInit } from '@angular/core';
import { Profil } from 'src/app/models/profil/profil.model';
import { ProfilService } from 'src/app/services/profil/profil.service';

@Component({
  selector: 'app-utilisateur',
  templateUrl: './utilisateur.component.html',
  styleUrls: ['./utilisateur.component.css']
})
export class UtilisateurComponent implements OnInit {

  profilePicUrl: string = "https://cdn.eso.org/images/screen/eso1907a.jpg";
  pseudo: string = "Pseudo en dur dans le *.ts";
  devise: string = "Devise en dur dans le *.ts";

  profils: Profil[] = [];
  constructor(private profilService:ProfilService) { }

  ngOnInit(): void {
  }

  onGetProfils(){
    this.profilService.getProfils()
    .subscribe(data=>{
      this.profils=data;
    })
  }
  
  
}
