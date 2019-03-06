import {Component, OnInit} from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import {EmployeeService} from "../employee.service";
import {Employee} from "../employee";

@Component({
  selector: 'app-search-form',
  templateUrl: './search-form.component.html',
  styleUrls: ['./search-form.component.css']
})
export class SearchFormComponent implements OnInit {

  employeeList: Employee[] = [];
  error : String;

  form = new FormGroup ({
    employeeId: new FormControl()
  });

  constructor(private employeeService: EmployeeService) { }

  ngOnInit() {
  }

  onSubmit() {
    this.employeeList = [];
    this.error = '';
    let id = this.form.get('employeeId').value;

    if( !id ) {
      this.employeeService.findAll()
        .subscribe(
          ( data: Employee[] ) => this.employeeList = data, // success path
          error => this.error = error // error path
        );
    }else{
      this.employeeService.getById(id)
        .subscribe(
          ( data: Employee ) => this.employeeList.push(data), // success path
          error => this.error = error.error.message // error path
        );
    }
  }

}
