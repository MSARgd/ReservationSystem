package ma.enset.Reservationservice.model;

import lombok.*;
@NoArgsConstructor @AllArgsConstructor @Builder @Getter @Setter @ToString
public class Resource {
    private Long id;
    private String name;
    private String type;
}

