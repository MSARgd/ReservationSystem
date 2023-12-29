package ma.enset.Reservationservice.web.rest;

import lombok.AllArgsConstructor;
import ma.enset.Reservationservice.entity.Reservation;
import ma.enset.Reservationservice.repository.ReservationRepository;
//import ma.enset.ResourcesService.entity.Resource;
//import ma.enset.ResourcesService.repository.ResourceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
public class ReservationController {
    private ReservationRepository reservationRepository;

    @GetMapping("/reservation")
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    @GetMapping("/reservation/{id}")
    public List<Reservation> findResources(@PathVariable("id") long id) {
        Reservation reservation = reservationRepository.findById(id).get();
        List<Reservation> reservations = new ArrayList<>();
        reservations.add(reservation);
        return reservations;

    }

    @RequestMapping("/reservation")
    public Reservation saveResource(@RequestBody Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @DeleteMapping("/reservation/{id}")
    public void deleteResource(@PathVariable("id") long id) {
        reservationRepository.deleteById(id);
    }

}