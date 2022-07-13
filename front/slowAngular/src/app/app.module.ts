import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ParcoursComponent } from './pages/parcours/parcours.component';
import { CalendarComponent } from './pages/calendar/calendar.component';
import { DateComponent } from './pages/parcours/components/date/date.component';
import { BaliseComponent } from './pages/parcours/components/balise/balise.component';
import { PreferencesComponent } from './pages/preferences/preferences.component';
import { LocomotionComponent } from './pages/preferences/components/locomotion/locomotion.component';
import { DifficulteComponent } from './pages/preferences/components/difficulte/difficulte.component';
import { SidebarComponent } from './pages/parcours/sidebar/sidebar.component';

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
    SidebarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
