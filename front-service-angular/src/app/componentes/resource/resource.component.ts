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
    this.http.get("http://localhost:8084/RESOURCE-SERVICE/resources").subscribe({
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

    this.http.delete(`http://localhost:8085/RESOURCE-SERVICE/resources/${resourceId}`).subscribe({
      next: () => {
        this.resources = this.resources.filter((resource: any) => resource.id !== resourceId);
      },
      error: (err) => {
        console.error(err);
      }
    });

  }

}
