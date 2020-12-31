package org.sid.customerservices;

import org.sid.customerservices.entities.Customer;
import org.sid.customerservices.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomerServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServicesApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository, RepositoryRestConfiguration repositoryRestConfiguration){
		repositoryRestConfiguration.exposeIdsFor(Customer.class);
		return args -> {
			customerRepository.save(new Customer(null,"Zakaria","Zakaria@gmail.com"));
			customerRepository.save(new Customer(null,"Ziko","ziko@gmail.com"));
			customerRepository.save(new Customer(null,"Zack","zack@gmail.com"));
			customerRepository.findAll().forEach(c -> {
				System.out.println(c.getName());
			} );
		};
	}

}
