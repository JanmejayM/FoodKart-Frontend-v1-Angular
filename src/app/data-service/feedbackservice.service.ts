import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Ifeedback } from '../models/ifeedback';
import { concat, Observable } from 'rxjs';



@Injectable({
  providedIn: 'root'
})
export class FeedbackserviceService {


  constructor(private http:HttpClient) { }

  getFeedback():Observable<Ifeedback[]>
  {
    return this.http.get <Ifeedback[]> ('http://localhost:8100/feedback-rest/fetch')

    /*
    return [{
      "feedid":1,
      "userid":1,
      "username":"Janmejay Mohapatra",
      "content":"The food is very awesome"
  },
  {
    "feedid":2,
    "userid":2,
    "username":"John",
    "content":"The Momos tastes Great"
}, {
  "feedid":3,
  "userid":3,
  "username":"Sam",
  "content":"Great Responsive Website"
}
];

*/


  }

  addFeedback(data:{
    userid: number,
    username: string,
    content: string
  })
  {
    return this.http.post('http://localhost:8100/feedback-rest/addfeedback',data);
  }



}
