package be.proximus.app.mus.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication()
public class AppMusApp extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(AppMusApp.class, args);
    }
}
