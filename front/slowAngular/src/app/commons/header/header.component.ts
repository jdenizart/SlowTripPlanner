import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  // Mettre plutôt le chemin absolu.
  logoPath: string = "../../assets/stpLogo.png";
  profilePicUrl: string = "https://www.mariderm.com/wp-content/uploads/2018/12/visage-tonus-after.jpg";

  constructor() { }

  ngOnInit(): void {
  }

}
