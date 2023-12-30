package ma.enset.ResourcesService.mapper;

import ma.enset.ResourcesService.dto.ResourceDTO;
import ma.enset.ResourcesService.entity.Resource;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ResourceMapper {
    ModelMapper modelMapper = new ModelMapper();
    public  Resource dtoToEntityResource(ResourceDTO resourceDTO){
        return modelMapper.map(resourceDTO, Resource.class);
    }
    public  ResourceDTO entityToResource(Resource resource){
        return modelMapper.map(resource, ResourceDTO.class);
    }
}
