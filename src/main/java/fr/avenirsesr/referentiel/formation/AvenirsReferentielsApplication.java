package fr.avenirsesr.referentiel.formation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "fr.avenirsesr.referentiel.formation")
@EntityScan("fr.avenirsesr.referentiel.formation.model")
public class AvenirsReferentielsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvenirsReferentielsApplication.class, args);
	}

}
