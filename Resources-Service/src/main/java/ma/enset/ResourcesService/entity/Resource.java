package ma.enset.ResourcesService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import ma.enset.ResourcesService.enums.TypeResource;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder @Getter @Setter
public class Resource {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private TypeResource typeResource;

}
