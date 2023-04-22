import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-dashboard',
  templateUrl: './admin-dashboard.component.html',
  styleUrls: ['./admin-dashboard.component.css']
})
export class AdminDashboardComponent {

  // product!:Product;
  constructor(private router:Router)
  {

    // if(localStorage.getItem("admin-log")!=null || localStorage.getItem("admin-log")!=undefined)
    // {
    //   this.router.navigate([""]);
  
    // }

  }
  logOut=()=>
  {
    localStorage.removeItem("admin-log");
    location.reload();
  }

  // add=(product:Product)=>
  // {

  // }
 
}
