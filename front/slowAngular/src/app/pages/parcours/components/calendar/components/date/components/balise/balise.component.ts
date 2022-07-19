import { Component, OnInit } from '@angular/core';
import {DomSanitizer} from '@angular/platform-browser';
import {MatIconRegistry} from '@angular/material/icon';

const BIN =
  `
  <svg width="32px" height="32px" viewBox="0 0 32 32" id="Outlined" xmlns="http://www.w3.org/2000/svg"><title/><g id="Fill"><rect height="12" width="2" x="15" y="12"/><rect height="12" width="2" x="19" y="12"/><rect height="12" width="2" x="11" y="12"/><path d="M20,6V5a3,3,0,0,0-3-3H15a3,3,0,0,0-3,3V6H4V8H6V27a3,3,0,0,0,3,3H23a3,3,0,0,0,3-3V8h2V6ZM14,5a1,1,0,0,1,1-1h2a1,1,0,0,1,1,1V6H14ZM24,27a1,1,0,0,1-1,1H9a1,1,0,0,1-1-1V8H24Z"/></g></svg>
`;

@Component({
  selector: 'app-balise',
  templateUrl: './balise.component.html',
  styleUrls: ['./balise.component.css']
})

export class BaliseComponent implements OnInit {
  balises = new Array();

  constructor(iconRegistry: MatIconRegistry, sanitizer: DomSanitizer) { 
    iconRegistry.addSvgIconLiteral('bin', sanitizer.bypassSecurityTrustHtml(BIN));
  }


  ngOnInit(): void {
  }

  removevalue(i: number){
    this.balises.splice(i,1);
  }

  addvalue(){
    this.balises.push({value: ""});
  }

}
