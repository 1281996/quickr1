package org.quikr.productPage;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableDiscoveryClient
public class ProductPageApplication  {
	


	public static void main(String[] args) {
		SpringApplication.run(ProductPageApplication.class, args);
	}


	
}

