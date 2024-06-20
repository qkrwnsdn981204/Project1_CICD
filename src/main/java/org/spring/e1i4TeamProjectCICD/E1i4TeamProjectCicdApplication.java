package org.spring.e1i4TeamProjectCICD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class E1i4TeamProjectCicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(E1i4TeamProjectCicdApplication.class, args);
	}

}
