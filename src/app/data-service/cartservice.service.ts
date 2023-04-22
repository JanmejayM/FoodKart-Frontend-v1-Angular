import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Icart } from '../models/icart';
import { Iproduct } from '../models/iproduct';

@Injectable({
  providedIn: 'root'
})
export class CartserviceService {

  cart:Icart[]=[];

  constructor(private http:HttpClient) {}

  getById(data:number):Observable<Icart[]>
  {
    return this.http.get<Icart[]>('http://localhost:8100/cart-rest/fetch/'+data.toString())
  }

  addToCart(product:Iproduct,userid:number)
  {
    
    /*{      
      "userid": 2,
       "productid": 3,
       "productqty": 2
   }*/

   let body={
    "userid":userid,
    "productid":product.id,
    "productqty":1

   }
    return this.http.post('http://localhost:8100/cart-rest/addCart',body)
  }

  deleteCart(cart:Icart)
  {
    return this.http.post('http://localhost:8100/cart-rest/deleteCart',cart)
  }

  updateQty(cart:Icart)
  {
    return this.http.post('http://localhost:8100/cart-rest/updateQty',cart)

  }


}
