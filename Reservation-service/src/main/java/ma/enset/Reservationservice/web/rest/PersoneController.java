package ma.enset.Reservationservice.web.rest;

import lombok.AllArgsConstructor;
import ma.enset.Reservationservice.entity.Person;
import ma.enset.Reservationservice.entity.Reservation;
import ma.enset.Reservationservice.repository.PersonRepository;
import ma.enset.Reservationservice.repository.ReservationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
public class PersoneController {
    private PersonRepository personRepository;

    @GetMapping("/persones")
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @GetMapping("/persones/{id}")
    public List<Person> findResources(@PathVariable("id") long id) {
        Person person = personRepository.findById(id).get();
        List<Person> persones  = new ArrayList<>();
        persones.add(person);
        return persones;

    }
    @RequestMapping("/persones")
    public Person saveResource(@RequestBody Person person) {
        return personRepository.save(person);
    }
    @DeleteMapping("/persones/{id}")
    public void deleteResource(@PathVariable("id") long id) {
        personRepository.deleteById(id);
    }
}