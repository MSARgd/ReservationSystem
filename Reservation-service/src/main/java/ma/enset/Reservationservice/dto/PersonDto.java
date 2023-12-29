package ma.enset.Reservationservice.dto;
import lombok.*;
@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
public class PersonDto {
    private String name;
    private String email;
    private String fonction;
}
