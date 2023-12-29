package ma.enset.Reservationservice.dto;
import lombok.*;
import java.util.Date;
@NoArgsConstructor @AllArgsConstructor @Setter @Getter @ToString @Builder
public class ReservationDto {
    private String name;
    private String context;
    private Date date;
    private int duree;
    private Long personId;
    private Long resourceId;
}
