import { Component } from '@angular/core';
import { Ifeedback } from 'src/app/models/ifeedback';
import { FeedbackserviceService } from 'src/app/data-service/feedbackservice.service';
@Component({
  selector: 'app-feedback-page',
  templateUrl: './feedback-page.component.html',
  styleUrls: ['./feedback-page.component.css']
})
export class FeedbackPageComponent {
  feedresult:Ifeedback[]=[];
   constructor(feedbackservice:FeedbackserviceService){
      feedbackservice.getFeedback().subscribe(
        data=>{
          this.feedresult=data
        }
      )
   }
   
}
