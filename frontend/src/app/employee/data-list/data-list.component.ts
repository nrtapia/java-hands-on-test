import {Component, Input, OnInit} from '@angular/core';
import {Employee} from "../employee";

@Component({
  selector: 'app-data-list',
  templateUrl: './data-list.component.html',
  styleUrls: ['./data-list.component.css']
})
export class DataListComponent implements OnInit {

  @Input() list: Employee[] = [];

  constructor() { }

  ngOnInit() {
  }

}
