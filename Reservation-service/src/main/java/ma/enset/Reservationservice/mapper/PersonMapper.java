package ma.enset.Reservationservice.mapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.Reservationservice.dto.PersonDto;
import ma.enset.Reservationservice.entity.Person;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor @AllArgsConstructor @Data
public class PersonMapper {
    ModelMapper modelMapper = new ModelMapper();
    public Person dtoToEntityPerson(PersonDto personDto) {
        return modelMapper.map(personDto, Person.class);
    }
    public PersonDto entityToDtoPerson(Person person) {
        return modelMapper.map(person, PersonDto.class);
    }

}
