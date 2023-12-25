package ma.enset.ResourcesService.web.rest;
import lombok.AllArgsConstructor;
import ma.enset.ResourcesService.entity.Resource;
import ma.enset.ResourcesService.repository.ResourceRepository;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
@AllArgsConstructor
public class ResourceRestController {
    private ResourceRepository resourceRepository;

    @GetMapping("/resources")
    public List<Resource> findAll() {
        return resourceRepository.findAll();
    }

    @GetMapping("/resources/{id}")
    public List<Resource> findResources(@PathVariable("id") long id) {
        Resource resource = resourceRepository.findById(id).get();
        List<Resource> resourceList = new ArrayList<>();
        resourceList.add(resource);
        return resourceList;

    }

    @RequestMapping("/resources")
    public Resource saveResource(@RequestBody Resource resource) {
        return resourceRepository.save(resource);
    }

    @DeleteMapping("/resources/{id}")
    public void deleteResource(@PathVariable("id") long id) {
        resourceRepository.deleteById(id);
    }


}