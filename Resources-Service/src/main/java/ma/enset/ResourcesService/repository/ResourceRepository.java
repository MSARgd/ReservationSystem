package ma.enset.ResourcesService.repository;

import ma.enset.ResourcesService.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource,Long> {
}
