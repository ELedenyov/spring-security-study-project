package by.fertigi.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableJpaRepositories
@EnableWebMvc
@SpringBootApplication
@EntityScan("by.fertigi.common.entity")
public class RestRunner {
    public static void main(String[] args) {
        SpringApplication.run(RestRunner.class, args);
    }
}
