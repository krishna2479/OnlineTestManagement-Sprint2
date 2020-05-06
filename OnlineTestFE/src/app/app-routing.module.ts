import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { AddtestComponent } from './addtest/addtest.component';
import { ViewtestComponent } from './viewtest/viewtest.component';
import { UpdatetestComponent } from './updatetest/updatetest.component';


const routes:Routes=[
  {path:"add",component : AddtestComponent},
  {path:"view",component : ViewtestComponent},
  {path:"update",component : UpdatetestComponent}
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
