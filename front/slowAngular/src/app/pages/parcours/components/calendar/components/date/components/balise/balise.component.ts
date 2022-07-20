import { Component, Input, OnInit } from '@angular/core';
import {DomSanitizer} from '@angular/platform-browser';
import {MatIconRegistry} from '@angular/material/icon';
import { CdkDragDrop, moveItemInArray, transferArrayItem } from "@angular/cdk/drag-drop";

// Interface des balises
export interface DragDropBaliseItem {
  ville: string;
  label: string;
  distance: string;
}

// Icones SVG
const BIN =
  `
  <svg width="32px" height="32px" viewBox="0 0 32 32" id="Outlined" xmlns="http://www.w3.org/2000/svg"><title/><g id="Fill"><rect height="12" width="2" x="15" y="12"/><rect height="12" width="2" x="19" y="12"/><rect height="12" width="2" x="11" y="12"/><path d="M20,6V5a3,3,0,0,0-3-3H15a3,3,0,0,0-3,3V6H4V8H6V27a3,3,0,0,0,3,3H23a3,3,0,0,0,3-3V8h2V6ZM14,5a1,1,0,0,1,1-1h2a1,1,0,0,1,1,1V6H14ZM24,27a1,1,0,0,1-1,1H9a1,1,0,0,1-1-1V8H24Z"/></g></svg>
`;

const FLAGSTART =
  `
  <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" style="fill: rgb(0, 0, 0); --darkreader-inline-fill:#e8e6e3;" data-darkreader-inline-fill=""><path d="M19 4H6V2H4v18H3v2h4v-2H6v-5h13a1 1 0 0 0 1-1V5a1 1 0 0 0-1-1zm-1 9H6V6h12v7z"></path></svg>
`;
const FLAGEND =
  `
  <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" style="fill: rgb(0, 0, 0); --darkreader-inline-fill:#e8e6e3;" data-darkreader-inline-fill=""><path d="M4 2v18H3v2h4v-2H6v-5h13a1 1 0 0 0 1-1V4a1 1 0 0 0-1-1H6V2H4zm4 3v2h2V5h2v2h2V5h2v2h2v2h-2v2h2v2h-2v-2h-2v2h-2v-2h-2v2H8v-2H6V9h2V7H6V5h2z"></path><path d="M8 9h2v2H8zm4 0h2v2h-2zm-2-2h2v2h-2zm4 0h2v2h-2z"></path></svg>
`;


@Component({
  selector: 'app-balise',
  templateUrl: './balise.component.html',
  styleUrls: ['./balise.component.css']
})


export class BaliseComponent implements OnInit {

  // Array des Balises
  @Input()
  balises: DragDropBaliseItem[] = [
  ];

  constructor(iconRegistry: MatIconRegistry, sanitizer: DomSanitizer) { 
    iconRegistry.addSvgIconLiteral('bin', sanitizer.bypassSecurityTrustHtml(BIN));
    iconRegistry.addSvgIconLiteral('flag-start', sanitizer.bypassSecurityTrustHtml(FLAGSTART));
    iconRegistry.addSvgIconLiteral('flag-end', sanitizer.bypassSecurityTrustHtml(FLAGEND));
  }


  ngOnInit(): void {
  }

  removevalue(i: number){
    this.balises.splice(i,1);
  }

  addvalue(){
    this.balises.push({ville:"", label:"Etape",distance:"km"});
  }

  drop(event: CdkDragDrop<DragDropBaliseItem[]>) {
    if (event.previousContainer === event.container) {
      moveItemInArray(event.container.data, event.previousIndex, event.currentIndex);
    } else {
      transferArrayItem(event.previousContainer.data,
                        event.container.data,
                        event.previousIndex,
                        event.currentIndex);
    }
  }
}
