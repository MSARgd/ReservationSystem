package ma.enset.Reservationservice.mapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.Reservationservice.dto.PersonDto;
import ma.enset.Reservationservice.dto.ReservationDto;
import ma.enset.Reservationservice.entity.Person;
import ma.enset.Reservationservice.entity.Reservation;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
@Component
@NoArgsConstructor @AllArgsConstructor @Data
public class ReservationMapper {
    ModelMapper modelMapper = new ModelMapper();
    public Reservation dtoToEntityReservation(ReservationDto reservationDto) {
        return modelMapper.map(reservationDto, Reservation.class);
    }
    public ReservationDto entityToDtoReservation(Reservation reservation) {
        return modelMapper.map(reservation, ReservationDto.class);
    }
}