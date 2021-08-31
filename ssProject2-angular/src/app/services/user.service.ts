import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient, private router: Router) { }

  public getAccount(email: String) {
    return this.http.get("http://localhost:9001/accounts/account?email=" + email, {responseType: 'json'});
  }
}
