import { Component, Inject } from '@angular/core';
import {DomSanitizer} from '@angular/platform-browser';
import {MatIconRegistry} from '@angular/material/icon';
import {
  MAT_MOMENT_DATE_FORMATS,
  MomentDateAdapter,
  MAT_MOMENT_DATE_ADAPTER_OPTIONS,
} from '@angular/material-moment-adapter';
import {DateAdapter, MAT_DATE_FORMATS, MAT_DATE_LOCALE} from '@angular/material/core';
import 'moment/locale/ja';
import 'moment/locale/fr';

const ADD =
  `
  <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" style="fill: rgb(0, 0, 0); --darkreader-inline-fill: #e8e6e3;" data-darkreader-inline-fill=""><path d="M19 11h-6V5h-2v6H5v2h6v6h2v-6h6z"></path></svg>
`;


@Component({
  selector: 'app-date',
  templateUrl: './date.component.html',
  styleUrls: ['./date.component.css'],
  providers: [
    // The locale would typically be provided on the root module of your application. We do it at
    // the component level here, due to limitations of our example generation script.
    {provide: MAT_DATE_LOCALE, useValue: 'fr'},

    // `MomentDateAdapter` and `MAT_MOMENT_DATE_FORMATS` can be automatically provided by importing
    // `MatMomentDateModule` in your applications root module. We provide it at the component level
    // here, due to limitations of our example generation script.
    {
      provide: DateAdapter,
      useClass: MomentDateAdapter,
      deps: [MAT_DATE_LOCALE, MAT_MOMENT_DATE_ADAPTER_OPTIONS],
    },
    {provide: MAT_DATE_FORMATS, useValue: MAT_MOMENT_DATE_FORMATS},
  ],
})
export class DateComponent {
  dates = new Array();
  TodayDate = new Date();
  constructor(iconRegistry: MatIconRegistry, sanitizer: DomSanitizer,private _adapter: DateAdapter<any>,
    @Inject(MAT_DATE_LOCALE) private _locale: string,) { 
    iconRegistry.addSvgIconLiteral('add', sanitizer.bypassSecurityTrustHtml(ADD));
    
  }


  ngOnInit(): void {
  }

  removevalue(i: number){
    this.dates.splice(i,1);
  }

  addvalue(){
    this.dates.push({value: ""});
  }

  getDateFormatString(): string {
      return 'DD/MM/YYYY';
  }
  
}
