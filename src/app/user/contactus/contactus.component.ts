import { Component, OnChanges, SimpleChanges } from '@angular/core';
import { FeedbackserviceService } from 'src/app/data-service/feedbackservice.service';
import { Iuser } from 'src/app/models/iuser';
@Component({
  selector: 'app-contactus',
  templateUrl: './contactus.component.html',
  styleUrls: ['./contactus.component.css']
})
export class ContactusComponent {
  jsonstring:string|null;
  constructor(private feedbackservice:FeedbackserviceService)
  {
 this.jsonstring=localStorage.getItem('user-log');
  }
  

  content:string="";
  addfeedback(){
   if(this.jsonstring!==null)
   {
    console.log(this.jsonstring)
   let json=JSON.parse(this.jsonstring);
  
  

  this.feedbackservice.addFeedback(
  {"userid": json[0].id,
  "username": json[0].username,
  "content": this.content
  }).subscribe();
  
  }
  
  }
}
