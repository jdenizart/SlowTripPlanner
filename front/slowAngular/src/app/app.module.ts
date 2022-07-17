
// Import de FormsModule pour faire fonctionner angular Material
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

// API reference for Angular Material
// Sidebar calls
import {MatSidenavModule} from '@angular/material/sidenav';
import {MatListModule} from '@angular/material/list'; 
import {MatTreeModule} from '@angular/material/tree';
import {MatButtonModule} from '@angular/material/button';
// Body calls
// Calendar
//Datepicker
import {MatInputModule} from '@angular/material/input'; 
import {MatFormFieldModule} from '@angular/material/form-field'; 
import {MatDatepickerModule} from '@angular/material/datepicker'; 
import {MatNativeDateModule } from '@angular/material/core';
// Calendar & Balise
import {MatExpansionModule} from '@angular/material/expansion';
import {MatIconModule} from '@angular/material/icon';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ParcoursComponent } from './pages/parcours/parcours.component';
import { CalendarComponent } from './pages/parcours/components/calendar/calendar.component';
import { DateComponent } from './pages/parcours/components/calendar/components/date/date.component';
import { BaliseComponent } from './pages/parcours/components/calendar/components/date/components/balise/balise.component';
import { PreferencesComponent } from './pages/parcours/components/preferences/preferences.component';
import { LocomotionComponent } from './pages/parcours/components/preferences/components/locomotion/locomotion.component';
import { DifficulteComponent } from './pages/parcours/components/preferences/components/difficulte/difficulte.component';
import { SidebarComponent } from './pages/parcours/components/sidebar/sidebar.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MapComponent } from './pages/parcours/components/map/map.component';


@NgModule({
  declarations: [
    AppComponent,
    ParcoursComponent,
    CalendarComponent,
    DateComponent,
    BaliseComponent,
    PreferencesComponent,
    LocomotionComponent,
    DifficulteComponent,
    SidebarComponent,
    MapComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule,
    // Angular Material Imports
    MatIconModule,
    // Sidenav
    MatSidenavModule,
    MatListModule,
    MatTreeModule,
    MatButtonModule,
    // Body
    // Calendrier > Date & Balise
    MatExpansionModule,
    MatDatepickerModule,
    MatNativeDateModule,
    MatFormFieldModule,
    MatInputModule, 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
