import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  // Mettre plutôt le chemin absolu.
  logoPath: string = "../../assets/stpLogo.png";
  profilePicUrl: string = "https://cdn.eso.org/images/screen/eso1907a.jpg";

  constructor() { }

  ngOnInit(): void {
  }

}
