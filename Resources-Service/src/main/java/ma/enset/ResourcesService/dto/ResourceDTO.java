package ma.enset.ResourcesService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.ResourcesService.enums.TypeResource;
@NoArgsConstructor @AllArgsConstructor @Builder @Data
public class ResourceDTO {
    private String name;
    private TypeResource type;
}
