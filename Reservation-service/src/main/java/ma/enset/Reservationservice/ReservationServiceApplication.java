package ma.enset.Reservationservice;

import com.github.javafaker.Faker;
import ma.enset.Reservationservice.entity.Person;
import ma.enset.Reservationservice.entity.Reservation;
import ma.enset.Reservationservice.repository.PersonRepository;
import ma.enset.Reservationservice.repository.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ReservationServiceApplication implements CommandLineRunner {
	private PersonRepository personRepository;
	private ReservationRepository reservationRepository;
	private final Faker faker = new Faker();

	public ReservationServiceApplication(PersonRepository personRepository, ReservationRepository reservationRepository) {
		this.personRepository = personRepository;
		this.reservationRepository = reservationRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(ReservationServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for (int i = 0; i < 10; i++) {
			Person person = Person.builder()
					.name(faker.name().fullName())
					.email(faker.internet().emailAddress())
					.fonction(faker.job().title())
					.build();
			personRepository.save(person);

			Reservation reservation = Reservation.builder()
					.name(faker.book().title())
					.context(faker.lorem().sentence())
					.date(faker.date().future(30, java.util.concurrent.TimeUnit.DAYS))
					.duree(faker.number().numberBetween(1, 10))
					.build();
			reservationRepository.save(reservation);
		}
	}
}