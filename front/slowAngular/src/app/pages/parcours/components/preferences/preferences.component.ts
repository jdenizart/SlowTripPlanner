import { Component, OnInit } from '@angular/core';
import {DomSanitizer} from '@angular/platform-browser';
import {MatIconRegistry} from '@angular/material/icon';

const BOOKMARK =
  `
  <svg
      width="4.3429999mm"
      height="5.8000002mm"
      viewBox="0 0 4.3429999 5.8000002"
      version="1.1"
      id="svg5844"
      inkscape:version="1.2 (dc2aedaf03, 2022-05-15)"
      sodipodi:docname="bookmark.svg"
      xmlns:inkscape="http://www.inkscape.org/namespaces/inkscape"
      xmlns:sodipodi="http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd"
      xmlns="http://www.w3.org/2000/svg"
      xmlns:svg="http://www.w3.org/2000/svg">
    <sodipodi:namedview
        id="namedview5846"
        pagecolor="#ffffff"
        bordercolor="#000000"
        borderopacity="0.25"
        inkscape:showpageshadow="2"
        inkscape:pageopacity="0.0"
        inkscape:pagecheckerboard="0"
        inkscape:deskcolor="#d1d1d1"
        inkscape:document-units="mm"
        showgrid="false"
        inkscape:zoom="12.072839"
        inkscape:cx="33.50496"
        inkscape:cy="19.133858"
        inkscape:window-width="1920"
        inkscape:window-height="1027"
        inkscape:window-x="-8"
        inkscape:window-y="-8"
        inkscape:window-maximized="1"
        inkscape:current-layer="layer1" />
    <defs
        id="defs5841" />
    <g
        inkscape:label="Calque 1"
        inkscape:groupmode="layer"
        id="layer1">
      <path
          fill-rule="evenodd"
          clip-rule="evenodd"
          d="M 0,0.24051996 C 0,0.107689 0.107687,0 0.240521,0 h 3.8483391 c 0.132817,0 0.240521,0.107687 0.240521,0.24051996 V 5.531987 c 0,0.08744 -0.04743,0.167975 -0.123917,0.210359 -0.07649,0.04238 -0.1699521,0.03993 -0.2440811,-0.0063 L 2.164691,4.613055 0.367997,5.736 C 0.293857,5.78233 0.200398,5.78478 0.123926,5.7423 0.047446,5.69992 0,5.619395 0,5.53194 Z m 0.481042,0.240522 V 5.098038 L 1.909738,4.205079 c 0.155987,-0.09745 0.353917,-0.09745 0.509905,0 L 3.848339,5.098038 V 0.48104196 Z"
          fill="currentColor"
          id="path19301"
          style="display:inline;fill:#4d4d4d;fill-opacity:1;stroke-width:0.481042"
          inkscape:export-filename="..\..\..\..\..\Desktop\bookmark.svg"
          inkscape:export-xdpi="328.40405"
          inkscape:export-ydpi="328.40405" />
    </g>
  </svg>
`;

const BIKE =
  `
  <svg
      width="5.2148981mm"
      height="3.951915mm"
      viewBox="0 0 5.2148981 3.951915"
      version="1.1"
      id="svg5844"
      inkscape:version="1.2 (dc2aedaf03, 2022-05-15)"
      sodipodi:docname="bike.svg"
      xmlns:inkscape="http://www.inkscape.org/namespaces/inkscape"
      xmlns:sodipodi="http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd"
      xmlns="http://www.w3.org/2000/svg"
      xmlns:svg="http://www.w3.org/2000/svg">
      <sodipodi:namedview
        id="namedview5846"
        pagecolor="#ffffff"
        bordercolor="#000000"
        borderopacity="0.25"
        inkscape:showpageshadow="2"
        inkscape:pageopacity="0.0"
        inkscape:pagecheckerboard="0"
        inkscape:deskcolor="#d1d1d1"
        inkscape:document-units="mm"
        showgrid="false"
        inkscape:zoom="24.145679"
        inkscape:cx="21.92939"
        inkscape:cy="5.218325"
        inkscape:window-width="1920"
        inkscape:window-height="1027"
        inkscape:window-x="-8"
        inkscape:window-y="-8"
        inkscape:window-maximized="1"
        inkscape:current-layer="layer1" />
      <defs
        id="defs5841" />
      <g
        inkscape:label="Calque 1"
        inkscape:groupmode="layer"
        id="layer1">
        <g
          id="g8776-6"
          transform="scale(0.04243895)"
          style="display:inline;fill:#4d4d4d;fill-opacity:1">
          <g
            id="g8756-5"
            style="fill:#4d4d4d;fill-opacity:1">
            <path
              class="st0"
              d="m 96.67,40.7 c 14.47,0 26.21,11.74 26.21,26.21 0,14.47 -11.74,26.21 -26.21,26.21 -14.47,0 -26.21,-11.74 -26.21,-26.21 0,-9.33 4.88,-17.53 12.23,-22.17 L 74.56,32.2 H 42.32 l -4.88,11.02 c 8.85,4.21 14.98,13.23 14.98,23.69 0,14.47 -11.74,26.21 -26.21,26.21 C 11.74,93.12 0,81.38 0,66.91 0,52.44 11.74,40.7 26.21,40.7 c 1.22,0 2.41,0.08 3.59,0.24 l 6.32,-14.3 c 0.65,-1.48 2.1,-2.36 3.62,-2.36 v 0 h 36.95 c 0.72,0 1.39,0.19 1.98,0.53 L 86.59,7.94 H 73.04 C 70.85,7.94 69.08,6.16 69.08,3.98 69.08,1.8 70.85,0 73.04,0 H 92.8 v 0.02 c 0.56,0 1.13,0.12 1.67,0.37 1.98,0.92 2.83,3.27 1.9,5.25 l -12.43,26.51 6.1,9.4 c 2.12,-0.56 4.34,-0.85 6.63,-0.85 z M 26.83,6.41 h 20.79 v 0 0 c 1.29,0 2.47,0.53 3.33,1.39 0.86,0.87 1.4,2.07 1.4,3.39 v 0 0 2.22 0 0 c 0,1.33 -0.54,2.53 -1.41,3.39 -0.85,0.85 -2.03,1.39 -3.33,1.39 v 0 0 H 26.83 v 0 0 c -1.29,0 -2.47,-0.53 -3.33,-1.39 -0.87,-0.87 -1.41,-2.07 -1.41,-3.39 v 0 0 -2.21 0 0 c 0,-1.33 0.54,-2.53 1.41,-3.39 0.85,-0.86 2.03,-1.39 3.33,-1.4 z m 7.4,44.07 -6.55,14.8 c -0.88,2 -3.22,2.91 -5.22,2.03 -2,-0.88 -2.91,-3.22 -2.03,-5.22 l 5.96,-13.46 c -0.06,0 -0.12,0 -0.18,0 -10.1,0 -18.28,8.19 -18.28,18.28 0,10.09 8.19,18.28 18.28,18.28 10.1,0 18.28,-8.19 18.28,-18.28 0,-7.22 -4.18,-13.46 -10.26,-16.43 z m 60.47,-1.75 6.36,9.79 c 1.19,1.83 0.67,4.28 -1.16,5.47 -1.83,1.19 -4.28,0.67 -5.47,-1.16 L 87,51.39 c -5.17,3.23 -8.62,8.97 -8.62,15.52 0,10.09 8.19,18.28 18.28,18.28 10.1,0 18.28,-8.19 18.28,-18.28 0,-10.1 -8.19,-18.28 -18.28,-18.28 -0.65,-0.01 -1.31,0.03 -1.96,0.1 z"
              id="path8754-3"
              style="clip-rule:evenodd;fill:#4d4d4d;fill-opacity:1;fill-rule:evenodd" />
          </g>
        </g>
      </g>
    </svg>
  `;

  const LVL =
    `
    <svg
    width="3.5487635mm"
    height="3.8575053mm"
    viewBox="0 0 3.5487635 3.8575053"
    version="1.1"
    id="svg5844"
    inkscape:version="1.2 (dc2aedaf03, 2022-05-15)"
    sodipodi:docname="level.svg"
    xmlns:inkscape="http://www.inkscape.org/namespaces/inkscape"
    xmlns:sodipodi="http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd"
    xmlns="http://www.w3.org/2000/svg"
    xmlns:svg="http://www.w3.org/2000/svg">
    <sodipodi:namedview
      id="namedview5846"
      pagecolor="#ffffff"
      bordercolor="#000000"
      borderopacity="0.25"
      inkscape:showpageshadow="2"
      inkscape:pageopacity="0.0"
      inkscape:pagecheckerboard="0"
      inkscape:deskcolor="#d1d1d1"
      inkscape:document-units="mm"
      showgrid="false"
      inkscape:zoom="24.145679"
      inkscape:cx="10.581603"
      inkscape:cy="12.424583"
      inkscape:window-width="1920"
      inkscape:window-height="1027"
      inkscape:window-x="-8"
      inkscape:window-y="-8"
      inkscape:window-maximized="1"
      inkscape:current-layer="layer1" />
    <defs
      id="defs5841" />
    <g
      inkscape:label="Calque 1"
      inkscape:groupmode="layer"
      id="layer1"
      transform="translate(-0.67156722,0.0379405)">
      <g
        id="g18794">
        <rect
          style="fill:none;fill-opacity:1;stroke:#4d4d4d;stroke-width:0.2;stroke-dasharray:none;stroke-dashoffset:1.25669;stroke-opacity:1"
          id="rect17478"
          width="0.69225514"
          height="1.2165507"
          x="0.77156723"
          y="1.7070634"
          ry="0.23079403" />
        <rect
          style="fill:none;fill-opacity:1;stroke:#4d4d4d;stroke-width:0.2;stroke-dasharray:none;stroke-dashoffset:1.25669;stroke-opacity:1"
          id="rect18637"
          width="0.87114447"
          height="1.8518668"
          x="1.8452159"
          y="1.076562"
          ry="0.29038149" />
        <rect
          style="fill:none;fill-opacity:1;stroke:#4d4d4d;stroke-width:0.2;stroke-dasharray:none;stroke-dashoffset:1.25669;stroke-opacity:1"
          id="rect18661"
          width="1.0346951"
          height="2.821521"
          x="3.0856357"
          y="0.062059499"
          ry="0.34517047" />
        <circle
          style="fill:none;fill-opacity:1;stroke:#4d4d4d;stroke-width:0.144;stroke-dasharray:none;stroke-dashoffset:1.25669;stroke-opacity:1"
          id="path18715"
          cx="2.2807882"
          cy="3.4517045"
          r="0.29586038" />
        <path
          style="fill:#ffffff;fill-opacity:1;stroke:#4d4d4d;stroke-width:0.163984;stroke-dasharray:none;stroke-dashoffset:1.25669;stroke-opacity:1"
          d="M 0.8290712,3.4517044 H 1.9849278"
          id="path18784" />
        <path
          style="fill:#ffffff;fill-opacity:1;stroke:#4d4d4d;stroke-width:0.132913;stroke-dasharray:none;stroke-dashoffset:1.25669;stroke-opacity:1"
          d="M 2.5766486,3.4517044 H 4.0988662"
          id="path18786" />
      </g>
    </g>
  </svg>
`;

@Component({
  selector: 'app-preferences',
  templateUrl: './preferences.component.html',
  styleUrls: ['./preferences.component.css']
})
export class PreferencesComponent implements OnInit {

  constructor(iconRegistry: MatIconRegistry, sanitizer: DomSanitizer) {
    iconRegistry.addSvgIconLiteral('bookmark', sanitizer.bypassSecurityTrustHtml(BOOKMARK));
    iconRegistry.addSvgIconLiteral('bike', sanitizer.bypassSecurityTrustHtml(BIKE));
    iconRegistry.addSvgIconLiteral('lvl', sanitizer.bypassSecurityTrustHtml(LVL));
  }

  ngOnInit(): void {
  }

}

