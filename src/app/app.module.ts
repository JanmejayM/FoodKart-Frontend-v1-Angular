import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavBarComponent } from './nav-bar/nav-bar.component';

import { FormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { RouterModule } from '@angular/router';

import { LoginPopComponent } from './login-pop/login-pop.component';
import { SignupPopComponent } from './signup-pop/signup-pop.component';
import { ErrorPageComponent } from './error-page/error-page.component';
import { UserModule } from './user/user.module';
import { ProductserviceService } from './data-service/productservice.service';
import { UserserviceService } from './data-service/userservice.service';
import { AuthGuard } from './guard-service/auth.guard';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { AdminAuthGuard } from './guard-service/admin-auth.guard';
import { NgxPaginationModule } from 'ngx-pagination';



@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    LoginPopComponent,
    SignupPopComponent,
    ErrorPageComponent,

    

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    UserModule,
    FormsModule,
    HttpClientModule,
    RouterModule,
    Ng2SearchPipeModule,
    NgxPaginationModule
    ],

    exports:[NavBarComponent],
  providers: [ProductserviceService,UserserviceService,AuthGuard,AdminAuthGuard],
  bootstrap: [AppComponent],

  
})
export class AppModule { }
