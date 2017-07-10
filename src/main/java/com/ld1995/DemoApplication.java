package com.ld1995;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner demo(IPatientRepository repository) {
//		return (args) -> {
//			log.info("-------------------------------");
//			for (Patient patient : repository.findAll()) {
//				log.info(patient.toString());
//			}
//			log.info("");};
//	}
}
