import { Component, OnInit } from '@angular/core';
import { Test } from '../test';
import { TestService } from '../test.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addtest',
  templateUrl: './addtest.component.html',
  styleUrls: ['./addtest.component.css']
})
export class AddtestComponent {
  test:Test = new Test();

  info:String;
  errorInfo:String;

  constructor(private testservice:TestService, private route: Router) { }

//  addTest(){
//    console.log("add Test");
//    this.testservice.insertTests(this.test).subscribe(data=>{this.test=data});
//    this.route.navigateByUrl("/view");
//    alert("Test added");
//  }


      addTest(){
        this.testservice.insertTests(this.test).subscribe(
          data=>{
            this.test=data;
            console.log(this.test);
            this.route.navigateByUrl("/view");
            alert("Test added successfully");
            this.errorInfo=undefined;
          },
          error=>{
            this.info=undefined;
            this.errorInfo=error.error;
          }
        );
       
      }
}
