import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginPopComponent } from './login-pop/login-pop.component';
import { SignupPopComponent } from './signup-pop/signup-pop.component';
import {ErrorPageComponent} from './error-page/error-page.component';
import { UserComponent } from './user/user.component';
import { CartComponent } from './user/cart/cart.component';
import { AuthGuard } from './guard-service/auth.guard';

import { DashboardComponent } from './user/dashboard/dashboard.component';
import { AdminComponent } from './admin/admin.component';
import { AdminLoginComponent } from './admin/admin-login/admin-login.component';
import { AdminDashboardComponent } from './admin/admin-dashboard/admin-dashboard.component';

import { ContactusComponent } from './user/contactus/contactus.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { AppModule } from './app.module';
import { AdminModule } from './admin/admin.module';
import { ProductPageComponent } from './admin/product-page/product-page.component';
import { FeedbackPageComponent } from './admin/feedback-page/feedback-page.component';
import { AdminAuthGuard } from './guard-service/admin-auth.guard';
import { ProductFormComponent } from './admin/product-form/product-form.component';
import { ProductEditFormComponent } from './admin/product-edit-form/product-edit-form.component';

const routes: Routes = [

  {path: '', component : LoginPopComponent},
  {path:'signup', component : SignupPopComponent},

  {path:'user',component:UserComponent,canActivate:[AuthGuard],

  children:[
    {path:'',component:DashboardComponent},
    {path:'cart',component:CartComponent},
    {path:'contactus',component:ContactusComponent}




  ]

},


  {path:'admin',component:AdminComponent,

  children:[
    {path:'',component:AdminLoginComponent}]
  },

  {path:'admin-dashboard',component:AdminDashboardComponent,canActivate:[AdminAuthGuard],

  children:[

  {path: 'product', component:ProductPageComponent, outlet:'aux'},
  {path: 'feedback', component:FeedbackPageComponent, outlet:'aux'},
  {path: 'add',component:ProductFormComponent,outlet:'aux'},
  {path: 'edit/:id',component:ProductEditFormComponent,outlet:'aux'}


]
},
{path:'**',component:ErrorPageComponent},






 

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],

})
export class AppRoutingModule { }
