import { Component, OnInit } from '@angular/core';
import Account from '../models/Account';
import Plan from '../models/Plan';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-plan-list',
  templateUrl: './plan-list.component.html',
  styleUrls: ['./plan-list.component.css']
})
export class PlanListComponent implements OnInit {

  constructor(private userService: UserService) { }

  plans!: Array<Plan>;
  ngOnInit(): void {
    this.userService.getAccount(localStorage.getItem("email")!).subscribe(data => {
      this.plans = (data as Account).plans
      console.log(this.plans)
    });
  }
}
