package GCS.GCS_GateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GcsGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GcsGateWayApplication.class, args);
	}

	@Bean
	public DiscoveryClientRouteDefinitionLocator routesDynamique(ReactiveDiscoveryClient rdc, DiscoveryLocatorProperties dlp) {
		return new DiscoveryClientRouteDefinitionLocator(rdc, dlp);
	}
}
