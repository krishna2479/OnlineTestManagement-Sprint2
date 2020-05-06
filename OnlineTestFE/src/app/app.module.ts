import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddtestComponent } from './addtest/addtest.component';
import { ViewtestComponent } from './viewtest/viewtest.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { UpdatetestComponent } from './updatetest/updatetest.component';

@NgModule({
  declarations: [
    AppComponent,
    AddtestComponent,
    ViewtestComponent,
    UpdatetestComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }


