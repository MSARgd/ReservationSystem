import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
@Component({
  selector: 'app-reservation',
  templateUrl: './reservation.component.html',
  styleUrls: ['./reservation.component.css']
})
export class ReservationComponent {
  reservations : any;

  constructor(private http:HttpClient) {
    this.http.get("http://localhost:8084/RESERVATION-SERVICE/reservations").subscribe({
      next:(data)=>{
        this.reservations=data;
      },
      error:(err)=>{

      }
    });
  }
  updateReservation(r: any) {

  }
  deleteReservation(r: any) {
    const reservationId = r.id;

    this.http.delete(`http://localhost:8085/RESERVATION-SERVICE/reservation/${reservationId}`).subscribe({
      next: () => {
        this.reservations = this.reservations.filter((reservation: any) => reservation.id !== reservationId);
      },
      error: (err) => {
        console.error(err);
      }
    });

  }

}
