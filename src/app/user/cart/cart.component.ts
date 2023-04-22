import { Component, OnInit,ViewChild,ElementRef } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Icart } from 'src/app/models/icart';
import { CartserviceService } from 'src/app/data-service/cartservice.service';
import { ProductserviceService } from 'src/app/data-service/productservice.service';
import { Iproduct } from 'src/app/models/iproduct';
import { FinalCart } from 'src/app/models/final-cart';
import { forkJoin } from 'rxjs';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent {



  cart:Icart[];
  product:Iproduct[]=[];

  finalCart:FinalCart[]=[]
  length:number=0;
  //arr:number[]=[]

  jsonstring:string|null

  cartitem:number=0
  qty:any
   

  productId:number[]=[]


  @ViewChild('#form1') Ref!:ElementRef;



  
  constructor(private cartservice:CartserviceService,private productservice:ProductserviceService,private http:HttpClient)
  {
    this.jsonstring=localStorage.getItem('user-log');

    if(this.jsonstring!==null )
    {
      let json=JSON.parse(this.jsonstring);

     
      cartservice.getById(Number(json[0].id)).subscribe(
        data=>
        {
          this.cart=data as Icart[]

          for(let i=0;i<data.length;i++)
          {
            this.productId.push(this.cart[i].productid)
          }
          console.log(this.productId)


          forkJoin([cartservice.getById(Number(json[0].id)),productservice.getProductByIds(this.productId)]).subscribe(results => {
          // handle the results of both API calls
          let result1 = results[0];
          let result2 = results[1];
        
          // do something with the results
        
          

          result1=this.sortDataBy(result1)
          result2=this.sortData(result2)

          console.log(result1)
          console.log(result2)

      
            for(let j=0;j<result2.length;j++)
            {
            if(result1[j].productid===result2[j].id)
            {
              let obj={
                product:result2[j] ,
                cart:result1[j]
              }

              this.finalCart.push(obj)
            }
          }
          
         console.log(this.finalCart)
         this.cartitem=this.finalCart.length


        
          // console.log(result2)
        });



        }
      )

      // combine both requests using forkJoin


      
      


     
      
    }
     


    }



    

    

   

    sortDataBy(data:Icart[]){
    let sortedData;

    sortedData = data.sort(function(a,b){
      // here a , b is whole object, you can access its property
  
      // it will return the difference to sort function and then 
      // sort compare that difference is equal to 0 or smaller than 0 or 
      // greater than 0. on the basis of that it will give sorted number list
        return a.productid - b.productid;
      })

      return sortedData;
  
  }

  sortData(data:Iproduct[]){
    let sortedData;

    sortedData = data.sort(function(a,b){
      // here a , b is whole object, you can access its property
  
      // it will return the difference to sort function and then 
      // sort compare that difference is equal to 0 or smaller than 0 or 
      // greater than 0. on the basis of that it will give sorted number list
        return a.id - b.id;
      })

      return sortedData;
  
  }


  delete(data:FinalCart)
  {
    let i=this.finalCart.indexOf(data);
    this.finalCart.splice(i,1)
  this.cartservice.deleteCart(data.cart).subscribe();
  }

  updateQty(c:FinalCart,value:string)
  {
    c.cart.productqty=Number(value)

 

    this.cartservice.updateQty(c.cart).subscribe()

  }

  
  




  }

  

  

    


   

  