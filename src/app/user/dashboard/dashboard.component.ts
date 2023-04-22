import { HttpClient } from '@angular/common/http';
import { Component, OnInit} from '@angular/core';
import { Router } from '@angular/router';
import { CartserviceService } from 'src/app/data-service/cartservice.service';
import { ProductserviceService } from 'src/app/data-service/productservice.service';
import { UserserviceService } from 'src/app/data-service/userservice.service';
import { Iproduct } from 'src/app/models/iproduct';


@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {
  isReadMore:boolean=false;
  user:any;
   result : Iproduct[]=[];
   isdis:boolean[]=[];
  //  cart:Product[]=[];
   Btn_text:string[]=[];
  addText:string[]=[];
  searchText:string="";
  page:number=1;
  totalRec!: number;
  maxsize:number=5;
  isTrue:boolean=true;

  jsonstring:string|null;

   


  constructor(private router:Router,
    private productservice:ProductserviceService,
    private userservice:UserserviceService,
    private http:HttpClient,
    private cartservice:CartserviceService)
  {
        this.jsonstring=localStorage.getItem('user-log');


    productservice.getProduct().subscribe(
      da=>this.result=da
      
    );
    // this.cart=cartservice.getProduct();







     
  }
  

  

  addCart=(product:Iproduct)=>
  {
    if(this.jsonstring!==null)
   {
    console.log(this.jsonstring)
   let json=JSON.parse(this.jsonstring);
  
  

    this.cartservice.addToCart(product,Number(json[0].id)).subscribe();


   }
  }
  
  

  

}
