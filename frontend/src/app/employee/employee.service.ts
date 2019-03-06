import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Employee} from "./employee";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  apiPath = '/api/employees';

  constructor(private http: HttpClient) { }

  findAll() {
    return this.http.get<Employee[]>(this.apiPath);
  }

  getById(id: number) {
    return this.http.get<Employee>(`${this.apiPath}/${id}`);
  }
}
