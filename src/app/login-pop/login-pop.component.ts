import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';
import { UserserviceService } from '../data-service/userservice.service';
import { Iuser } from '../models/iuser';

@Component({
  selector: 'app-login-pop',
  templateUrl: './login-pop.component.html',
  styleUrls: ['./login-pop.component.css']
})
export class LoginPopComponent {

message:string="";

constructor(private http:HttpClient,private router:Router,private userservice:UserserviceService)
{
  if(localStorage.getItem("user-log")!=null || localStorage.getItem("user-log")!=undefined)
  {
    this.router.navigate(["/user"]);

  }
  

}

onSubmit(login:{username:string,password:string}):void
 {
  let response:Iuser;
   this.userservice.login(login).subscribe(
    
    data=>{
      response=data;

      
      if(Object.keys(response).length)
      {
        this.router.navigate(["/user"]);
       localStorage.setItem("user-log",JSON.stringify(response));

      }
      else{
        this.message="Wrong Credentials";
      }



    }
   )

  
  
 


}
}
