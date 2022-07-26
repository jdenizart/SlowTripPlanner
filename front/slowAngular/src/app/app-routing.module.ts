import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccueilComponent } from './pages/accueil/accueil.component';
import { ParcoursComponent } from './pages/parcours/parcours.component';
import { UtilisateurComponent } from './pages/profil/components/utilisateur/utilisateur.component';

const routes: Routes = [
  { path:"accueil", component: AccueilComponent},
  { path:"parcours", component: ParcoursComponent},
  { path:"profil", component: UtilisateurComponent},
  { path:"**", component: AccueilComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
