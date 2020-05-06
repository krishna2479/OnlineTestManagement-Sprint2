import { Component, OnInit } from '@angular/core';
import { Test } from '../test';
import { from } from 'rxjs';
import { TestService } from '../test.service';

@Component({
  selector: 'app-viewtest',
  templateUrl: './viewtest.component.html',
  styleUrls: ['./viewtest.component.css']
})
export class ViewtestComponent implements OnInit {
tests:Test[]=[];
  constructor(private testservice:TestService) { }

  ngOnInit(): void {
    this.testservice.loadTests().subscribe(
        data=>{this.tests=data}
    );
  
     
  }
  deleteTest(testId:number): void {
    this.testservice.deleteTests(testId).subscribe((data)=>{this.tests=data});
    alert("Test deleted successfully");

}}
