package ma.enset.Reservationservice.repository;

import ma.enset.Reservationservice.entity.Person;
import ma.enset.Reservationservice.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
