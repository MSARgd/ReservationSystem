package ma.enset.Reservationservice.entity;

import jakarta.persistence.*;
import lombok.*;
import ma.enset.Reservationservice.model.Resource;

import java.util.Date;

@Entity
@NoArgsConstructor @AllArgsConstructor @Setter @Getter @ToString @Builder
public class Reservation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String context;
    private Date date;
    private int duree;
    @ManyToOne
    private Person person;
    private Long resourceId;
    @Transient
    private Resource resource;
}
