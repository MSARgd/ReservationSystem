import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
// import * as path from "path";
import {ResourceComponent} from "./componentes/resource/resource.component";
import {AuthGuard} from "./guards/auth-guard.guard";
import {PersonesComponent} from "./componentes/persones/persones.component";

const routes: Routes = [
  {path:'',redirectTo:"resources",pathMatch:"full"},
  {path:"resources",component:ResourceComponent,canActivate:[AuthGuard],data:{roles:['ADMIN']}},


  {path:"persones",component:PersonesComponent,canActivate:[AuthGuard],data:{roles:['ADMIN','USER']}},

];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
