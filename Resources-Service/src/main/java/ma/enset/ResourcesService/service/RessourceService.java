package ma.enset.ResourcesService.service;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import ma.enset.ResourcesService.entity.Resource;
import ma.enset.ResourcesService.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@AllArgsConstructor @NoArgsConstructor @Builder
public class RessourceService {
    private ResourceRepository resourceRepository;
    public Resource addResource(Resource resource){
        return resourceRepository.save(resource);
    }
    public List<Resource> getAllRessources() {
        return resourceRepository.findAll();
    }
    public Resource getRessourceById(Long id) throws Exception {
        return resourceRepository.findById(id)
                .orElseThrow(() -> new Exception("Not Found" + id));
    }
}