import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Router} from "@angular/router";

@Injectable({
  providedIn: 'root'
})
export class ResourceService {
  constructor(private http:HttpClient,private router: Router) {

  }
  public doRegistraction({resource}: { resource: any }){
    return this.http.post("http://localhost:8081/RESOURCES-SERVICE/resources",resource,
    );


  }

  public getRadars(){
    return this.http.get("http://localhost:8081/RESOURCES-SERVICE/resources");
  }


  public getRadarById( id: number ){
    return this.http.get("http://localhost:8081/radars/"+id);
  }


  public deleteRadarByiId({id}: { id: number }){
    return this.http.delete("http://localhost:8081/radars/"+id);
  }

  public updateRadar(radar: any) {
    return this.http.put(`http://localhost:8081/radars/${radar.id}`, radar);
  }


}


