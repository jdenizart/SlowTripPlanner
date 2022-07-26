import { Component, OnInit } from '@angular/core';
import * as L from 'leaflet';
import 'leaflet-routing-machine';
import { icon, Marker } from 'leaflet';
import { Inject, Input } from '@angular/core';

export const DEFAULT_LAT = 50.63139948404484 ;
export const DEFAULT_LON =  3.0696619372860483 ;
export const TITULO = 'Proyecto';
const iconRetinaUrl = 'assets/marker-icon-2x.png';
const iconUrl = 'assets/marker-icon.png';
const shadowUrl = 'assets/marker-shadow.png';

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.css']
})
export class MapComponent implements OnInit {

  private map:any;
  @Input() lat: number = DEFAULT_LAT;
  @Input() lon: number = DEFAULT_LON;
  @Input() titulo: string = TITULO ;
 
  constructor() {
  }

  ngOnInit(): void {
    this.initMap();
  }

  private initMap(): void {
      //configuración del mapa
      this.map = L.map('map', {
        center: [this.lat, this.lon],
        attributionControl: false,
        zoom: 14
      });

      //iconos personalizados
      var iconDefault = L.icon({
        iconRetinaUrl,
        iconUrl,
        shadowUrl,
        iconSize: [25, 41],
        iconAnchor: [12, 41],
        popupAnchor: [1, -34],
        tooltipAnchor: [16, -28],
        shadowSize: [41, 41]
      });
      L.Marker.prototype.options.icon = iconDefault;

      //titulo
      const tiles = L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
        maxZoom: 11,
        attribution: '&copy; <a href="https://1938.com.es">Web Inteligencia Artificial</a>'
      });

      //marca con pop up
      //const lon = this.lon + 0.009;
      //const lat = this.lat + 0.009;
      //const marker = L.marker([lat + 0.005, lon + 0.005]).bindPopup(this.titulo);
      //marker.addTo(this.map);


      // Coordonnées pour le parcours par defaut
      const latAston = 50.63365291886565;
      const lonAston = 3.0222118601547243;
      const lonAfpa = 3.1585630197707335;
      const latAfpa = 50.69353394438157;

    //ruta
    L.Routing.control({
      router: L.Routing.osrmv1({
        serviceUrl: `https://router.project-osrm.org/route/v1/`
      }),
      showAlternatives: false,
      fitSelectedRoutes: false,
      show: false,
      routeWhileDragging: false,
      waypoints: [
        L.latLng(latAston, lonAston),
        L.latLng(latAfpa, lonAfpa)
      ]
    }).addTo(this.map);
      tiles.addTo(this.map);
    }
  }