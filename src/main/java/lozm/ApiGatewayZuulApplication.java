package lozm;

import lozm.global.filters.PreFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ApiGatewayZuulApplication {

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayZuulApplication.class, args);
	}

}
