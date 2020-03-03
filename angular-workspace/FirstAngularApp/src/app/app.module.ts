import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyFirstComponent } from './my-first/my-first.component';
import { AppareilComponent } from './appareil/appareil.component';
import { FormulaireComponent } from './formulaire/formulaire.component';
import { FormulairePersonneComponent } from './formulaire-personne/formulaire-personne.component';
import { PersonneComponent } from './personne/personne.component';

@NgModule({
  declarations: [
    AppComponent,
    MyFirstComponent,
    AppareilComponent,
    FormulaireComponent,
    FormulairePersonneComponent,
    PersonneComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
