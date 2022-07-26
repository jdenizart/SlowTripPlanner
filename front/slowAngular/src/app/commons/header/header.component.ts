import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  // Mettre plutôt le chemin absolu.
  logoPath: string = "../../assets/stpLogo.png";
  profilePicUrl: string = "../../assets/snail.png";

  constructor() { }

  ngOnInit(): void {
  }

}
