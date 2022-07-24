import { Component, OnInit, ViewChild } from '@angular/core';
import {DomSanitizer} from '@angular/platform-browser';
import {MatIconRegistry} from '@angular/material/icon';

const CALENDAR =
  `
  <svg
  width="6.245914mm"
  height="6.2459202mm"
  viewBox="0 0 6.245914 6.2459202"
  version="1.1"
  id="svg14746"
  inkscape:version="1.2 (dc2aedaf03, 2022-05-15)"
  sodipodi:docname="calendar.svg"
  xmlns:inkscape="http://www.inkscape.org/namespaces/inkscape"
  xmlns:sodipodi="http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd"
  xmlns="http://www.w3.org/2000/svg"
  xmlns:svg="http://www.w3.org/2000/svg">
 <sodipodi:namedview
    id="namedview14748"
    pagecolor="#ffffff"
    bordercolor="#000000"
    borderopacity="0.25"
    inkscape:showpageshadow="2"
    inkscape:pageopacity="0.0"
    inkscape:pagecheckerboard="0"
    inkscape:deskcolor="#d1d1d1"
    inkscape:document-units="mm"
    showgrid="false"
    inkscape:zoom="0.75455247"
    inkscape:cx="206.08242"
    inkscape:cy="67.589733"
    inkscape:window-width="1920"
    inkscape:window-height="1027"
    inkscape:window-x="-8"
    inkscape:window-y="-8"
    inkscape:window-maximized="1"
    inkscape:current-layer="layer1" />
 <defs
    id="defs14743" />
 <g
    inkscape:label="Calque 1"
    inkscape:groupmode="layer"
    id="layer1"
    transform="translate(-50.175744,-130.82509)">
   <path
      fill-rule="evenodd"
      clip-rule="evenodd"
      d="m 51.857336,130.82509 c 0.132673,0 0.240228,0.10755 0.240228,0.24023 v 0.24023 h 2.402274 v -0.24023 c 0,-0.13267 0.107574,-0.24023 0.240227,-0.24023 0.132653,0 0.240228,0.10755 0.240228,0.24023 v 0.24023 h 0.720682 c 0.398009,0 0.720683,0.32266 0.720683,0.72068 v 4.32409 c 0,0.39801 -0.322674,0.72069 -0.720683,0.72069 h -4.804549 c -0.398023,0 -0.720682,-0.32268 -0.720682,-0.72069 v -4.32409 c 0,-0.39802 0.322659,-0.72068 0.720682,-0.72068 h 0.720683 v -0.24023 c 0,-0.13267 0.107555,-0.24023 0.240227,-0.24023 z m 2.642502,0.96091 v 0.24023 c 0,0.13267 0.107574,0.24023 0.240227,0.24023 0.132653,0 0.240228,-0.10756 0.240228,-0.24023 V 131.786 h 0.720682 c 0.132655,0 0.240228,0.10756 0.240228,0.24023 v 0.72068 h -5.285004 v -0.72068 c 0,-0.13267 0.107555,-0.24023 0.240227,-0.24023 h 0.720683 v 0.24023 c 0,0.13267 0.107555,0.24023 0.240227,0.24023 0.132673,0 0.240228,-0.10756 0.240228,-0.24023 V 131.786 Z m -3.843639,1.44137 v 3.12295 c 0,0.13265 0.107555,0.24023 0.240227,0.24023 h 4.804549 c 0.132655,0 0.240228,-0.10757 0.240228,-0.24023 v -3.12295 z m 2.402274,0.72068 c 0,-0.13267 0.107556,-0.24023 0.240228,-0.24023 0.132673,0 0.240227,0.10756 0.240227,0.24023 0,0.13267 -0.107555,0.24023 -0.240227,0.24023 -0.132673,0 -0.240228,-0.10756 -0.240228,-0.24023 z m 1.201137,-0.24023 c -0.132672,0 -0.240227,0.10756 -0.240227,0.24023 0,0.13267 0.107555,0.24023 0.240227,0.24023 0.132673,0 0.240228,-0.10756 0.240228,-0.24023 0,-0.13267 -0.107556,-0.24023 -0.240228,-0.24023 z m 0.720683,0.24023 c 0,-0.13267 0.107573,-0.24023 0.240227,-0.24023 0.132655,0 0.240228,0.10756 0.240228,0.24023 0,0.13267 -0.107574,0.24023 -0.240228,0.24023 -0.132654,0 -0.240227,-0.10756 -0.240227,-0.24023 z m 0.240227,0.72068 c -0.132654,0 -0.240227,0.10756 -0.240227,0.24023 0,0.13267 0.107573,0.24023 0.240227,0.24023 0.132655,0 0.240228,-0.10756 0.240228,-0.24023 0,-0.13267 -0.107574,-0.24023 -0.240228,-0.24023 z m -1.201137,0.24023 c 0,-0.13267 0.107555,-0.24023 0.240227,-0.24023 0.132673,0 0.240228,0.10756 0.240228,0.24023 0,0.13267 -0.107556,0.24023 -0.240228,0.24023 -0.132672,0 -0.240227,-0.10756 -0.240227,-0.24023 z m -0.720682,-0.24023 c -0.132673,0 -0.240228,0.10756 -0.240228,0.24023 0,0.13267 0.107556,0.24023 0.240228,0.24023 0.132673,0 0.240227,-0.10756 0.240227,-0.24023 0,-0.13267 -0.107555,-0.24023 -0.240227,-0.24023 z m -1.201137,0.24023 c 0,-0.13267 0.107555,-0.24023 0.240227,-0.24023 0.132673,0 0.240228,0.10756 0.240228,0.24023 0,0.13267 -0.107556,0.24023 -0.240228,0.24023 -0.132673,0 -0.240227,-0.10756 -0.240227,-0.24023 z m -0.720682,-0.24023 c -0.132673,0 -0.240228,0.10756 -0.240228,0.24023 0,0.13267 0.107555,0.24023 0.240228,0.24023 0.132672,0 0.240227,-0.10756 0.240227,-0.24023 0,-0.13267 -0.107555,-0.24023 -0.240227,-0.24023 z m -0.240228,1.20114 c 0,-0.13265 0.107555,-0.24023 0.240228,-0.24023 0.132672,0 0.240227,0.10758 0.240227,0.24023 0,0.13265 -0.107555,0.24023 -0.240227,0.24023 -0.132673,0 -0.240228,-0.10757 -0.240228,-0.24023 z m 1.201137,-0.24023 c -0.132673,0 -0.240227,0.10758 -0.240227,0.24023 0,0.13265 0.107555,0.24023 0.240227,0.24023 0.132673,0 0.240228,-0.10757 0.240228,-0.24023 0,-0.13265 -0.107556,-0.24023 -0.240228,-0.24023 z m 0.720682,0.24023 c 0,-0.13265 0.107556,-0.24023 0.240228,-0.24023 0.132673,0 0.240227,0.10758 0.240227,0.24023 0,0.13265 -0.107555,0.24023 -0.240227,0.24023 -0.132673,0 -0.240228,-0.10757 -0.240228,-0.24023 z m 1.201137,-0.24023 c -0.132672,0 -0.240227,0.10758 -0.240227,0.24023 0,0.13265 0.107555,0.24023 0.240227,0.24023 0.132673,0 0.240228,-0.10757 0.240228,-0.24023 0,-0.13265 -0.107556,-0.24023 -0.240228,-0.24023 z"
      fill="currentColor"
      id="path5274"
      style="display:inline;fill:#4d4d4d;stroke-width:0.480455" />
 </g>
</svg>
`;

@Component({
  selector: 'app-calendar',
  templateUrl: './calendar.component.html',
  styleUrls: ['./calendar.component.css']
})

export class CalendarComponent implements OnInit {
  constructor(iconRegistry: MatIconRegistry, sanitizer: DomSanitizer) { 
    iconRegistry.addSvgIconLiteral('calendar', sanitizer.bypassSecurityTrustHtml(CALENDAR));
  }

  ngOnInit(): void {
  }

}