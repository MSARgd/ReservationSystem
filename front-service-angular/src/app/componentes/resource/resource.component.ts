import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
@Component({
  selector: 'app-resource',
  templateUrl: './resource.component.html',
  styleUrls: ['./resource.component.css']
})
export class ResourceComponent {
  resources : any;

  constructor(private http:HttpClient) {
    this.http.get("http://localhost:8081/resource-service/resources").subscribe({
      next:(data)=>{
        this.resources=data;
      },
      error:(err)=>{

      }
    });
  }
  updateResources(r: any) {

  }
  deleteResources(r: any) {
    const resourceId = r.id;
    // http://localhost:8081/resource-service/resources/6
    this.http.delete(`http://localhost:8081/resource-service/resources/${resourceId}`).subscribe({
      next: () => {
        this.resources = this.resources.filter((resource: any) => resource.id !== resourceId);
      },
      error: (err) => {
        console.error(err);
      }
    });

  }

}
