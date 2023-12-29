package ma.enset.Reservationservice.feign;

import ma.enset.Reservationservice.model.Resource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name = "RESOURCE-SERVICE")
public interface ResourceFeignClient {
    @GetMapping("/{id}")
    Resource getResourceById(@PathVariable Long id);

    @GetMapping("/all")
    List<Resource> getAllResources();
}

