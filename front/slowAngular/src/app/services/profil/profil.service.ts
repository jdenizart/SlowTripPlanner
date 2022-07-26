import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Profil } from 'src/app/models/profil/profil.model';
import { environment } from 'src/environments/environment';

const apiUrlProfil = environment.API_URL+"/profils";
@Injectable({
  providedIn: 'root'
})
export class ProfilService {

  constructor(private http:HttpClient) { }
  
  public getProfils(){
    return this.http.get<Profil[]>(apiUrlProfil)
    
  }

  public save(newProfil:Profil){
    return this.http.post<Profil>(apiUrlProfil, newProfil)
  }

  /**findById(profil_id:any){
    return this.http.get<Profil>(${}/${profil_id});
  }

  save(profil:Profil){
    return this.http.post<Profil>(apiUrlProfil,profil);
  }

  delete(id:number){
    return this.http.delete<Profil>(${apiUrlProfil}/${id});
  }*/
}
