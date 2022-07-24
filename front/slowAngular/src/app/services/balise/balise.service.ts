import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Balise } from 'src/app/models/balise/balise.model';
import { environment } from 'src/environments/environment';

const apiUrlAlbum = environment.API_URL+"/balises";
@Injectable({
  providedIn: 'root'
})
export class BaliseService {

  constructor(private http:HttpClient) { 

  }

  findAll(){
    return this.http.get<Balise[]>(apiUrlAlbum);
  }

}
