package aston.slowspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SlowSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SlowSpringApplication.class, args);
    }

}
