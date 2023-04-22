import { Component } from '@angular/core';
import { MatIconRegistry } from '@angular/material/icon';
import { DomSanitizer } from '@angular/platform-browser';
import { Router} from '@angular/router';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent {


  constructor(
    
    private router: Router
  )
  {
   
  }

  

  login=()=>
    {
      this.router.navigate([""]);
    }
  
  signup=()=>
  {
    this.router.navigate(["signup"]);

  } 
  
 
}
