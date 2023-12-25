package ma.enset.ResourcesService;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.enset.ResourcesService.entity.Resource;
import ma.enset.ResourcesService.enums.TypeResource;
import ma.enset.ResourcesService.repository.ResourceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Random;
import java.util.UUID;

@SpringBootApplication
@EnableDiscoveryClient
public class ResourcesServiceApplication implements CommandLineRunner {
	private final ResourceRepository resourceRepository;

	public ResourcesServiceApplication(ResourceRepository resourceRepository) {
		this.resourceRepository = resourceRepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(ResourcesServiceApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		for (int i=0;i<10;i++){
			resourceRepository.save(Resource.builder().name(UUID.randomUUID().toString().substring(1,15))
					.typeResource(TypeResource.values()[new Random().nextInt(TypeResource.values().length)])
					.build());
		}
	}
}
