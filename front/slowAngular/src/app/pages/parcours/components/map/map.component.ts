import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.css']
})
export class MapComponent implements OnInit {

  const apiKey = "YOUR_API_KEY";
  const basemapEnum = "ArcGIS:Streets";

  const map = L.map("map", {
    minZoom: 2
  }).setView([34.02, -118.805], 13);

  calque = L.esri.Vector.vectorBasemapLayer(basemapEnum, {
    apiKey: apiKey
  }).addTo(map);

  constructor() { }

  ngOnInit(): void {
  }

}
