package aston.slowspring;

import aston.slowspring.entity.Balise;
import aston.slowspring.entity.Profil;
import aston.slowspring.repository.BaliseRepo;
import aston.slowspring.repository.ProfilRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SlowSpringApplication implements CommandLineRunner {
    @Autowired
    private BaliseRepo baliseRepo;
    private ProfilRepo profilRepo;
    public static void main(String[] args) {
        SpringApplication.run(SlowSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    baliseRepo.save(new Balise("balise2",null ,2.0,true,null,null));
    profilRepo.save(new Profil("meiry11","null","Respirez le courage, expirez la peur",null));


    baliseRepo.findAll().forEach(b->{
        System.out.println(b.toString());
    });
    }
}
