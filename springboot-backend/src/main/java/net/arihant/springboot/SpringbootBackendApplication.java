package net.arihant.springboot;

import net.arihant.springboot.model.Customer;
import net.arihant.springboot.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void run(String... args) throws Exception {
//		Customer customer = new Customer();
//		customer.setFirstname("ishu");
//		customer.setLastname("jain");
//		customer.setEmailId("ishu@gmail.com");
//		customerRepository.save(customer);
//
//		Customer customer1 = new Customer();
//		customer1.setFirstname("naman");
//		customer1.setLastname("jai");
//		customer1.setEmailId("naman@gmail.com");
//		customerRepository.save(customer1);
	}
}
