import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UtilisateurComponent } from './pages/profil/components/utilisateur/utilisateur.component';

const routes: Routes = [
  {
    path: "/utilisateurs", component: UtilisateurComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
