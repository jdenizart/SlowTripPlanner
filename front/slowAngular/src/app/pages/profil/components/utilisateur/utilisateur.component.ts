import { Component, OnInit } from '@angular/core';
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

  constructor(private profilService:ProfilService) { }

  ngOnInit(): void {
  }

  onGetProfils(){
    this.profilService.getProfil()
    .subscribe(data=>{
      this.profils=data;
    })
  }
  
  
}
