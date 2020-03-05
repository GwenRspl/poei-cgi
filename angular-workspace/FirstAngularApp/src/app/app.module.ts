import { PersonneComponent } from './tp-personne/personne/personne.component';
import { FormulairePersonneComponent } from './tp-personne/formulaire-personne/formulaire-personne.component';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MyFirstComponent } from './my-first/my-first.component';
import { AppareilComponent } from './appareil/appareil.component';
import { FormulaireComponent } from './formulaire/formulaire.component';
import { ConvertToSpacePipe } from './convert-to-space.pipe';
import { HomeComponent } from './home/home.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { CatalogueComponent } from './catalogue/catalogue.component';
import { RatingModule } from 'ng-starrating';
import { HttpClientModule } from '@angular/common/http';
import { FilterPipe } from './filter.pipe';

@NgModule({
  declarations: [
    AppComponent,
    MyFirstComponent,
    AppareilComponent,
    FormulaireComponent,
    FormulairePersonneComponent,
    PersonneComponent,
    ConvertToSpacePipe,
    HomeComponent,
    PageNotFoundComponent,
    CatalogueComponent,
    FilterPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RatingModule,
    HttpClientModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
