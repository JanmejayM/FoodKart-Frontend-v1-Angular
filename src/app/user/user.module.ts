import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { UserRoutingModule } from './user-routing.module';
import { DashboardComponent } from './dashboard/dashboard.component';
import { UserComponent } from './user.component';
import { RouterModule } from '@angular/router';

import { PrivateNavbarComponent } from './private-navbar/private-navbar.component';
import { FormsModule } from '@angular/forms';
import { CartComponent } from './cart/cart.component';
import { ContactusComponent } from './contactus/contactus.component';
import { ReadmoreComponent } from './readmore/readmore.component';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { NgModel } from '@angular/forms';
import { NgxPaginationModule } from 'ngx-pagination';
import { CheckoutPageComponent } from './checkout-page/checkout-page.component';



@NgModule({
  declarations: [
    DashboardComponent,
    UserComponent,
    PrivateNavbarComponent,
    CartComponent,
    ContactusComponent,
    ReadmoreComponent,
    CheckoutPageComponent
  ],
  imports: [
    CommonModule,
    UserRoutingModule,
    FormsModule,
    Ng2SearchPipeModule,
    NgxPaginationModule
  ],

})
export class UserModule { }
