import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddPlanComponent } from './add-plan/add-plan.component';
import { DeviceComponent } from './device/device.component';
import { HomepageComponent } from './homepage/homepage.component';
import { LoginComponent } from './login/login.component';
import { PlanListComponent } from './plan-list/plan-list.component';

const routes: Routes = [
  {path:"", redirectTo:"login",pathMatch:"full"},
  {path:"login", component: LoginComponent},
  {path:"home", component: HomepageComponent},
  {path:"planList", component: PlanListComponent},
  {path:"addPlan", component: AddPlanComponent},
  {path:"device", component: DeviceComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
