import { Component } from '@angular/core';
import {DomSanitizer} from '@angular/platform-browser';
import {MatIconRegistry} from '@angular/material/icon';

const ADD =
  `
  <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" style="fill: rgb(0, 0, 0); --darkreader-inline-fill: #e8e6e3;" data-darkreader-inline-fill=""><path d="M19 11h-6V5h-2v6H5v2h6v6h2v-6h6z"></path></svg>
`;


@Component({
  selector: 'app-date',
  templateUrl: './date.component.html',
  styleUrls: ['./date.component.css']
})
export class DateComponent {

  constructor(iconRegistry: MatIconRegistry, sanitizer: DomSanitizer) { 
    iconRegistry.addSvgIconLiteral('add', sanitizer.bypassSecurityTrustHtml(ADD));
  }


  ngOnInit(): void {
  }
}
