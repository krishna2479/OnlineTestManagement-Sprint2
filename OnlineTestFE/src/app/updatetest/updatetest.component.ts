import { Component, OnInit } from '@angular/core';
import { TestService } from '../test.service';
import { Router } from '@angular/router';
import { Test } from '../test';

@Component({
  selector: 'app-updatetest',
  templateUrl: './updatetest.component.html',
  styleUrls: ['./updatetest.component.css']
})
export class UpdatetestComponent {

  test:Test = new Test();
  constructor(private testservice:TestService,private route:Router) { }

  update(){
    console.log("update test");
    this.testservice.updateTests(this.test.testId,this.test).subscribe(data=>{this.test=data});
    this.route.navigateByUrl("/view");
    alert("Test updated successfully");
  }


}