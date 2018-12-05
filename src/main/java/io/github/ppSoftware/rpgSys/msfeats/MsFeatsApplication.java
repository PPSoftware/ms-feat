package io.github.ppSoftware.rpgSys.msfeats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MsFeatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsFeatsApplication.class, args);
	}
}
