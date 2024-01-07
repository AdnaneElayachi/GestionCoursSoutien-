package GCS.GCS_GAdministation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GcsGAdministationApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcsGAdministationApplication.class, args);
	}

}
