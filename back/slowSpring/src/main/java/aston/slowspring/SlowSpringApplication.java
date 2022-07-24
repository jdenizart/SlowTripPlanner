package aston.slowspring;

import aston.slowspring.entity.Balise;
import aston.slowspring.repository.BaliseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SlowSpringApplication implements CommandLineRunner {
    @Autowired
    private BaliseRepo baliseRepo;
    public static void main(String[] args) {
        SpringApplication.run(SlowSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    baliseRepo.save(new Balise("balise2",null ,2.0,true,null,null));

    baliseRepo.findAll().forEach(b->{
        System.out.println(b.toString());
    });
    }
}
