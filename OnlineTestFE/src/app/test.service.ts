import { Injectable, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Test } from './test';


@Injectable({
  providedIn: 'root'
})
export class TestService {

  private Tests: Test[]=[];
  constructor(private http:HttpClient) { }

  loadTests():Observable<any>{
    return this.http.get("http://localhost:1121/alltest")
  }
  // setTests(tests:Test[]):void{
  //   this.tests=tests;
  // }
  // getTests:Test[]{
  //   return this.defaultStatus;
  // }

  insertTests(test:Test):Observable<any>{
    return this.http.post("http://localhost:1121/add",test,{responseType:"text"});
  }

  deleteTests(testId:number):Observable<any>{
    // this.Tests=this.Tests.filter(test=>test.testId!=testId);responseType:"text"
    return this.http.delete("http://localhost:1121/delete/"+testId);
  }

  updateTests(testId:number,test:Test):Observable<any>{
    return this.http.put("http://localhost:1121/update/"+testId,test,{responseType:"text"});
  }

}
