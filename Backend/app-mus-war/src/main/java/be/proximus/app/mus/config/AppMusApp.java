package be.proximus.app.mus.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("be.proximus.app.mus.repository")
public class AppMusApp {
	public static void main(String[] args) {
		SpringApplication.run(AppMusApp.class, args);
	}
}
