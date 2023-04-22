import { Component } from '@angular/core';

@Component({
  selector: 'app-private-navbar',
  templateUrl: './private-navbar.component.html',
  styleUrls: ['./private-navbar.component.css']
})
export class PrivateNavbarComponent {

  logOut=()=>
  {
    localStorage.removeItem("user-log");
    location.reload();
  }

}
