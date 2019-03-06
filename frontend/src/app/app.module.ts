import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SearchFormComponent } from './employee/search-form/search-form.component';
import { DataListComponent } from './employee/data-list/data-list.component';

@NgModule({
  declarations: [
    AppComponent,
    SearchFormComponent,
    DataListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
