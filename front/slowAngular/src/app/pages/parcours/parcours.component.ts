import { Component, OnInit } from '@angular/core';
import {Title} from "@angular/platform-browser";

@Component({
  selector: 'app-parcours',
  templateUrl: './parcours.component.html',
  styleUrls: ['./parcours.component.css']
})
export class ParcoursComponent implements OnInit {

  constructor(private titleService:Title) {
    this.titleService.setTitle("Slow - parcours");
  }

  ngOnInit(): void {
  }

}
