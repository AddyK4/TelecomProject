import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import Account from '../models/Account';
import { LoginService } from '../services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private loginService : LoginService, private router : Router) { }
  
  email! : string;
  password! : string;

  ngOnInit(): void {
  }

  buttonLogin(email: string, password: string) {
    console.log("Login Button clicked");
    let emailFound = false;
    this.loginService.login().subscribe(data => {
      for(let account of data as Array<Account>) {
        if (account.email == email) {
          emailFound = true;
          if (account.password == password) {
            console.log("Authenticated");
            localStorage.setItem("email", email);
            this.router.navigate(["/home"]);
            break;
          }
          else {
            console.log("Invalid Password");
            break;
          }
        }
      }
      if(!emailFound) {
        console.log("Email not found");
      }
    })
  }
}
